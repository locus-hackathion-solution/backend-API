package com.blume.locus.hackathontimeapi.jsonModels;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Welcome {
    private String code;
    private Route[] routes;
    private Waypoint[] waypoints;

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String value) {
        this.code = value;
    }

    @JsonProperty("routes")
    public Route[] getRoutes() {
        return routes;
    }

    @JsonProperty("routes")
    public void setRoutes(Route[] value) {
        this.routes = value;
    }

    @JsonProperty("waypoints")
    public Waypoint[] getWaypoints() {
        return waypoints;
    }

    @JsonProperty("waypoints")
    public void setWaypoints(Waypoint[] value) {
        this.waypoints = value;
    }
}




