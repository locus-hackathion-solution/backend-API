package com.blume.locus.hackathontimeapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Routes {
    private Destination source;
    private Destination destination;
    private String startDate;
    private String startTime;
    private double distance;
    private long duration;
    private Route route;

    @JsonProperty("source")
    public Destination getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Destination value) {
        this.source = value;
    }

    @JsonProperty("destination")
    public Destination getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(Destination value) {
        this.destination = value;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String value) {
        this.startDate = value;
    }

    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(String value) {
        this.startTime = value;
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
    public long getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(long value) {
        this.duration = value;
    }

    @JsonProperty("route")
    public Route getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(Route value) {
        this.route = value;
    }
}
