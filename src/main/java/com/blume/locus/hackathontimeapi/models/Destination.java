package com.blume.locus.hackathontimeapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Destination {
    private String name;
    private double lat;
    private double destinationLong;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String value) {
        this.name = value;
    }

    @JsonProperty("lat")
    public double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(double value) {
        this.lat = value;
    }

    @JsonProperty("long")
    public double getDestinationLong() {
        return destinationLong;
    }

    @JsonProperty("long")
    public void setDestinationLong(double value) {
        this.destinationLong = value;
    }
}
