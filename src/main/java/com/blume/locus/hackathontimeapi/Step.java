package com.blume.locus.hackathontimeapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Step {
    private Intersection[] intersections;
    private DrivingSide drivingSide;
    private String geometry;
    private Mode mode;
    private double duration;
    private Maneuver maneuver;
    private double weight;
    private double distance;
    private String name;
    private String ref;
    private String destinations;
    private String rotaryName;

    @JsonProperty("intersections")
    public Intersection[] getIntersections() {
        return intersections;
    }

    @JsonProperty("intersections")
    public void setIntersections(Intersection[] value) {
        this.intersections = value;
    }

    @JsonProperty("driving_side")
    public DrivingSide getDrivingSide() {
        return drivingSide;
    }

    @JsonProperty("driving_side")
    public void setDrivingSide(DrivingSide value) {
        this.drivingSide = value;
    }

    @JsonProperty("geometry")
    public String getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(String value) {
        this.geometry = value;
    }

    @JsonProperty("mode")
    public Mode getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(Mode value) {
        this.mode = value;
    }

    @JsonProperty("duration")
    public double getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(double value) {
        this.duration = value;
    }

    @JsonProperty("maneuver")
    public Maneuver getManeuver() {
        return maneuver;
    }

    @JsonProperty("maneuver")
    public void setManeuver(Maneuver value) {
        this.maneuver = value;
    }

    @JsonProperty("weight")
    public double getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(double value) {
        this.weight = value;
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

    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    @JsonProperty("ref")
    public void setRef(String value) {
        this.ref = value;
    }

    @JsonProperty("destinations")
    public String getDestinations() {
        return destinations;
    }

    @JsonProperty("destinations")
    public void setDestinations(String value) {
        this.destinations = value;
    }

    @JsonProperty("rotary_name")
    public String getRotaryName() {
        return rotaryName;
    }

    @JsonProperty("rotary_name")
    public void setRotaryName(String value) {
        this.rotaryName = value;
    }
}