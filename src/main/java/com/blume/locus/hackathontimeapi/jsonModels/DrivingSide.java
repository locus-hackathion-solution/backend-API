
package com.blume.locus.hackathontimeapi.jsonModels;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum DrivingSide {
    NONE, RIGHT, SLIGHT_LEFT, SLIGHT_RIGHT, STRAIGHT, UTURN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NONE:
                return "none";
            case RIGHT:
                return "right";
            case SLIGHT_LEFT:
                return "slight left";
            case SLIGHT_RIGHT:
                return "slight right";
            case STRAIGHT:
                return "straight";
            case UTURN:
                return "uturn";
        }
        return null;
    }

    @JsonCreator
    public static DrivingSide forValue(String value) throws IOException {
        if (value.equals("none")) return NONE;
        if (value.equals("right")) return RIGHT;
        if (value.equals("slight left")) return SLIGHT_LEFT;
        if (value.equals("slight right")) return SLIGHT_RIGHT;
        if (value.equals("straight")) return STRAIGHT;
        if (value.equals("uturn")) return UTURN;
        throw new IOException("Cannot deserialize DrivingSide");
    }
}