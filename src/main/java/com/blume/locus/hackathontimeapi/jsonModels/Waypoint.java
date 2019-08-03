package com.blume.locus.hackathontimeapi.jsonModels;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Waypoint {
    private String hint;
    private double distance;
    private String name;
    private double[] location;

    @JsonProperty("hint")
    public String getHint() {
        return hint;
    }

    @JsonProperty("hint")
    public void setHint(String value) {
        this.hint = value;
    }

    @JsonProperty("distance")
    public double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(double value) {
        this.distance = value;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String value) {
        this.name = value;
    }

    @JsonProperty("location")
    public double[] getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(double[] value) {
        this.location = value;
    }
}