package com.blume.locus.hackathontimeapi;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.IOException;

public enum Type {
    ARRIVE, CONTINUE, DEPART, END_OF_ROAD, EXIT_ROTARY, EXIT_ROUNDABOUT, FORK, MERGE, NEW_NAME, NOTIFICATION, OFF_RAMP, ON_RAMP, ROTARY, ROUNDABOUT, ROUNDABOUT_TURN, TURN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ARRIVE:
                return "arrive";
            case CONTINUE:
                return "continue";
            case DEPART:
                return "depart";
            case END_OF_ROAD:
                return "end of road";
            case EXIT_ROTARY:
                return "exit rotary";
            case EXIT_ROUNDABOUT:
                return "exit roundabout";
            case FORK:
                return "fork";
            case MERGE:
                return "merge";
            case NEW_NAME:
                return "new name";
            case NOTIFICATION:
                return "notification";
            case OFF_RAMP:
                return "off ramp";
            case ON_RAMP:
                return "on ramp";
            case ROTARY:
                return "rotary";
            case ROUNDABOUT:
                return "roundabout";
            case ROUNDABOUT_TURN:
                return "roundabout turn";
            case TURN:
                return "turn";
        }
        return null;
    }

    @JsonCreator
    public static Type forValue(String value) throws IOException {
        if (value.equals("arrive")) return ARRIVE;
        if (value.equals("continue")) return CONTINUE;
        if (value.equals("depart")) return DEPART;
        if (value.equals("end of road")) return END_OF_ROAD;
        if (value.equals("exit rotary")) return EXIT_ROTARY;
        if (value.equals("exit roundabout")) return EXIT_ROUNDABOUT;
        if (value.equals("fork")) return FORK;
        if (value.equals("merge")) return MERGE;
        if (value.equals("new name")) return NEW_NAME;
        if (value.equals("notification")) return NOTIFICATION;
        if (value.equals("off ramp")) return OFF_RAMP;
        if (value.equals("on ramp")) return ON_RAMP;
        if (value.equals("rotary")) return ROTARY;
        if (value.equals("roundabout")) return ROUNDABOUT;
        if (value.equals("roundabout turn")) return ROUNDABOUT_TURN;
        if (value.equals("turn")) return TURN;
        throw new IOException("Cannot deserialize Type");
    }
}