package com.blume.locus.hackathontimeapi.models;

import com.blume.locus.hackathontimeapi.xmlModels.LatLong;

public class RouteRequest {

    private LatLong source;
    private LatLong destination;
    private String time;

    public LatLong getSource() {
        return source;
    }

    public LatLong getDestination() {
        return destination;
    }

    public String getTime() {
        return time;
    }
}
