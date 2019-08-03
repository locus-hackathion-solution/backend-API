package com.blume.locus.hackathontimeapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Maneuver {
    private long bearingAfter;
    private double[] location;
    private long bearingBefore;
    private Type type;
    private Modifier modifier;
    private Long exit;

    @JsonProperty("bearing_after")
    public long getBearingAfter() {
        return bearingAfter;
    }

    @JsonProperty("bearing_after")
    public void setBearingAfter(long value) {
        this.bearingAfter = value;
    }

    @JsonProperty("location")
    public double[] getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(double[] value) {
        this.location = value;
    }

    @JsonProperty("bearing_before")
    public long getBearingBefore() {
        return bearingBefore;
    }

    @JsonProperty("bearing_before")
    public void setBearingBefore(long value) {
        this.bearingBefore = value;
    }

    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type value) {
        this.type = value;
    }

    @JsonProperty("modifier")
    public Modifier getModifier() {
        return modifier;
    }

    @JsonProperty("modifier")
    public void setModifier(Modifier value) {
        this.modifier = value;
    }

    @JsonProperty("exit")
    public Long getExit() {
        return exit;
    }

    @JsonProperty("exit")
    public void setExit(Long value) {
        this.exit = value;
    }
}