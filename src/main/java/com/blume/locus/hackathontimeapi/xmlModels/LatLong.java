package com.blume.locus.hackathontimeapi.xmlModels;


public class LatLong {
    public String lat;
    public String lon;

    public LatLong(String lat, String lon) {
        this.lat = lat;
        this.lon = lon;
    }

    @Override
    public String toString() {
        return lat + "," + lon;
    }
}
