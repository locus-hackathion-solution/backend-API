package com.blume.locus.hackathontimeapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Route {
    private Leg[] legs;
    private double distance;
    private double duration;
    private String weightName;
    private double weight;

    @JsonProperty("legs")
    public Leg[] getLegs() {
        return legs;
    }

    @JsonProperty("legs")
    public void setLegs(Leg[] value) {
        this.legs = value;
    }

    @JsonProperty("distance")
    public double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(double value) {
        this.distance = value;
    }

    @JsonProperty("duration")
    public double getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(double value) {
        this.duration = value;
    }

    @JsonProperty("weight_name")
    public String getWeightName() {
        return weightName;
    }

    @JsonProperty("weight_name")
    public void setWeightName(String value) {
        this.weightName = value;
    }

    @JsonProperty("weight")
    public double getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(double value) {
        this.weight = value;
    }
}