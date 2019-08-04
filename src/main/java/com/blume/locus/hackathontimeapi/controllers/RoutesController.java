package com.blume.locus.hackathontimeapi.controllers;

import com.blume.locus.hackathontimeapi.Utility;
import com.blume.locus.hackathontimeapi.models.RouteRequest;
import com.blume.locus.hackathontimeapi.models.Routes;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Random;

@RestController
@RequestMapping("/routes")
public class RoutesController {

    private static final String BASE_PATH = "/usr/app/";
    //    private static final String FILE_PATH = "C:\\\\Users\\\\user\\\\Hackathon\\\\hackathon-time-api\\\\src\\\\main\\\\resources\\\\sample_routes_data_0.json";

    @RequestMapping(method = RequestMethod.GET, value = "", produces = "application/json")
    public ResponseEntity<Routes> getRoutes() throws IOException {
        Routes routes = buildRoutes(getFilePath());
        return new ResponseEntity<>(routes, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "", produces = "application/json")
    public ResponseEntity<Routes> createRoutes(@RequestBody RouteRequest routeRequest) throws IOException {
        Routes routes = buildRoutes(getFilePath());
        return new ResponseEntity<>(routes, HttpStatus.OK);
    }

    private String getFilePath() {
        int i = new Random().nextInt(5);
        return BASE_PATH + "sample_routes_data_" + i + ".json";
    }

    private Routes buildRoutes(String filePath) {
        String routesStr = Utility.readFile(filePath);
        return new Gson().fromJson(routesStr, Routes.class);
    }
}
