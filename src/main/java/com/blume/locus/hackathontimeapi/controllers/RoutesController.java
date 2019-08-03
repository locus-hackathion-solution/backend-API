package com.blume.locus.hackathontimeapi.controllers;

import com.blume.locus.hackathontimeapi.Utility;
import com.blume.locus.hackathontimeapi.models.Routes;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/routes")
public class RoutesController {

    private static final String FILE_PATH = "C:\\\\Users\\\\user\\\\Hackathon\\\\hackathon-time-api\\\\src\\\\main\\\\resources\\\\sample_routes_data.json";

    @RequestMapping(method = RequestMethod.GET, value = "", produces = "application/json")
    public ResponseEntity<Routes> getRoutes() throws IOException {

        Routes routes = buildRoutes();

        return new ResponseEntity<>(routes, HttpStatus.OK);
    }

    private Routes buildRoutes() {
        String routesStr = Utility.readFile(FILE_PATH);
        return new Gson().fromJson(routesStr, Routes.class);
    }
}
