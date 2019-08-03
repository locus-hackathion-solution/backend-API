package com.blume.locus.hackathontimeapi.jsonModels;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Leg {
    private Step[] steps;
    private double distance;
    private double duration;
    private String summary;
    private double weight;

    @JsonProperty("steps")
    public Step[] getSteps() {
        return steps;
    }

    @JsonProperty("steps")
    public void setSteps(Step[] value) {
        this.steps = value;
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

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String value) {
        this.summary = value;
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