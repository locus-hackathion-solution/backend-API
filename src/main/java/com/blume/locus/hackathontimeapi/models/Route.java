package com.blume.locus.hackathontimeapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Route {
    private Segment[] segments;

    @JsonProperty("segments")
    public Segment[] getSegments() {
        return segments;
    }

    @JsonProperty("segments")
    public void setSegments(Segment[] value) {
        this.segments = value;
    }
}
