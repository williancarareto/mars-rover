package com.marsrovers.models;

import com.marsrovers.exceptions.InvalidDirectionException;

public enum Directions {
    EAST('E'), WEST('W'), SOUTH('S'), NORTH('N');

    private char direction;

    Directions(char direction) {
        this.direction = direction;
    }

    public static Directions getDirection(char directionChar){
        Directions[] directions = Directions.values();

        for (Directions direction : directions){
            if (direction.direction == directionChar){
                return direction;
            }
        }

        throw new InvalidDirectionException("Invalid direction letter: " + directionChar);
    }
}
