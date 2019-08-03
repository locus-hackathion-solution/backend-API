package com.blume.locus.hackathontimeapi.jsonModels;

import com.blume.locus.hackathontimeapi.jsonModels.DrivingSide;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Lane {
    private boolean valid;
    private DrivingSide[] indications;

    @JsonProperty("valid")
    public boolean getValid() {
        return valid;
    }

    @JsonProperty("valid")
    public void setValid(boolean value) {
        this.valid = value;
    }

    @JsonProperty("indications")
    public DrivingSide[] getIndications() {
        return indications;
    }

    @JsonProperty("indications")
    public void setIndications(DrivingSide[] value) {
        this.indications = value;
    }
}