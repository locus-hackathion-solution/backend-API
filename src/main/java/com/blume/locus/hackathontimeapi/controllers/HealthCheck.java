package com.blume.locus.hackathontimeapi.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

//import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/health")
public class HealthCheck {

    @RequestMapping(method = RequestMethod.GET, value = "", produces = "application/json")
    public ResponseEntity<String> checkHealth() throws IOException {
        return new ResponseEntity<>("1.0", HttpStatus.OK);
    }

}