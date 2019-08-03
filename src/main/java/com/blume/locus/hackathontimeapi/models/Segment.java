package com.blume.locus.hackathontimeapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Segment {
    private Waypoint[] waypoints;
    private String color;

    @JsonProperty("waypoints")
    public Waypoint[] getWaypoints() {
        return waypoints;
    }

    @JsonProperty("waypoints")
    public void setWaypoints(Waypoint[] value) {
        this.waypoints = value;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String value) {
        this.color = value;
    }
}
