package com.blume.locus.hackathontimeapi.jsonModels;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum Modifier {
    LEFT, RIGHT, SHARP_LEFT, SHARP_RIGHT, SLIGHT_LEFT, SLIGHT_RIGHT, STRAIGHT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LEFT:
                return "left";
            case RIGHT:
                return "right";
            case SHARP_LEFT:
                return "sharp left";
            case SHARP_RIGHT:
                return "sharp right";
            case SLIGHT_LEFT:
                return "slight left";
            case SLIGHT_RIGHT:
                return "slight right";
            case STRAIGHT:
                return "straight";
        }
        return null;
    }

    @JsonCreator
    public static Modifier forValue(String value) throws IOException {
        if (value.equals("left")) return LEFT;
        if (value.equals("right")) return RIGHT;
        if (value.equals("sharp left")) return SHARP_LEFT;
        if (value.equals("sharp right")) return SHARP_RIGHT;
        if (value.equals("slight left")) return SLIGHT_LEFT;
        if (value.equals("slight right")) return SLIGHT_RIGHT;
        if (value.equals("straight")) return STRAIGHT;
        throw new IOException("Cannot deserialize Modifier");
    }
}