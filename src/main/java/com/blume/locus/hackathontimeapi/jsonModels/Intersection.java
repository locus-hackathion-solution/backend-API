package com.blume.locus.hackathontimeapi.jsonModels;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Intersection {
    private Long out;
    private boolean[] entry;
    private long[] bearings;
    private double[] location;
    private Long in;
    private ClassElement[] classes;
    private Lane[] lanes;

    @JsonProperty("out")
    public Long getOut() {
        return out;
    }

    @JsonProperty("out")
    public void setOut(Long value) {
        this.out = value;
    }

    @JsonProperty("entry")
    public boolean[] getEntry() {
        return entry;
    }

    @JsonProperty("entry")
    public void setEntry(boolean[] value) {
        this.entry = value;
    }

    @JsonProperty("bearings")
    public long[] getBearings() {
        return bearings;
    }

    @JsonProperty("bearings")
    public void setBearings(long[] value) {
        this.bearings = value;
    }

    @JsonProperty("location")
    public double[] getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(double[] value) {
        this.location = value;
    }

    @JsonProperty("in")
    public Long getIn() {
        return in;
    }

    @JsonProperty("in")
    public void setIn(Long value) {
        this.in = value;
    }

    @JsonProperty("classes")
    public ClassElement[] getClasses() {
        return classes;
    }

    @JsonProperty("classes")
    public void setClasses(ClassElement[] value) {
        this.classes = value;
    }

    @JsonProperty("lanes")
    public Lane[] getLanes() {
        return lanes;
    }

    @JsonProperty("lanes")
    public void setLanes(Lane[] value) {
        this.lanes = value;
    }
}