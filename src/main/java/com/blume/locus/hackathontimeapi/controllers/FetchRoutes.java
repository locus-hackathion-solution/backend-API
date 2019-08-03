package com.blume.locus.hackathontimeapi.controllers;

import com.blume.locus.hackathontimeapi.Welcome;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;
import com.squareup.okhttp.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@RestController
@RequestMapping("/routes")
public class FetchRoutes {

    public static final String FILE_PATH = "C:\\Users\\user\\Hackathon\\hackathon-time-api\\src\\main\\resources\\latlongdata.csv";

    private OkHttpClient client = new OkHttpClient();

    @RequestMapping(method = RequestMethod.GET, value = "", produces = "application/json")
    public ResponseEntity<String> getRoutes() throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println("values = " + values[0] + "," + values[1] + "," + values[2] + "," + values[3]);
                doGetRequestAsync(buildUrl(values[0], values[1], values[2], values[3]));
            }
        }

        return new ResponseEntity<>("1.0", HttpStatus.OK);
    }


    private String buildUrl(String lat, String lon, String lat2, String lon2) {
        return "http://osrm-1644136849.us-east-1.elb.amazonaws.com/route/v1/driving/" +
                lat + "," + lon + ";" + lat2 + "," + lon2 + "?overview=false&steps=true";
    }

    private String doGetRequest(String url) throws IOException {

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    private void doGetRequestAsync(String url) throws IOException {

        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Response response) throws IOException {
                if (!response.isSuccessful()) {
                    System.out.println("Failure of response " + request.urlString());
                } else {
                    System.out.println(request.urlString());
                    System.out.println(response.body().string());

                    Welcome welcome = JsonParser.fromJsonString(response.body().string());
                    System.out.println("--------------------- After welcome ---------------- " + welcome);

//                    double[] location = welcome.getRoutes()[0].getLegs()[0].getSteps()[0].getIntersections()[0].getLocation();
//
//                    System.out.println("----------- lat, long => " + location[0] + ", " + location[1]);
                }
            }
        });
    }
}


class JsonParser {
    // Serialize/deserialize helpers

    public static Welcome fromJsonString(String json) throws IOException {
//        return getObjectReader().readValue(json);
        return new Gson().fromJson(json, Welcome.class);
    }

    public static String toJsonString(Welcome obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        reader = mapper.reader(Welcome.class);
        writer = mapper.writerFor(Welcome.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}