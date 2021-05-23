package com.marsrovers.models;

public enum Directions {
    EAST('E'), WEST('W'), SOUTH('S'), NORTH('N');

    private char direction;

    Directions(char direction) {
        this.direction = direction;
    }

    public static Directions getDirection(char directionChar){
        return null;
    }
}
