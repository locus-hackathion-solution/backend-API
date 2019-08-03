package com.blume.locus.hackathontimeapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Waypoint {
    private double lat;
    private double lon;

    @JsonProperty("lat")
    public double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(double value) {
        this.lat = value;
    }

    @JsonProperty("lon")
    public double getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(double value) {
        this.lon = value;
    }
}