package com.marsrovers.models;

import java.util.List;

public class Rover {

    private int x;
    private int y;
    private Directions direction;
    private List<Actions> actions;

    public Rover(int x, int y, Directions direction, String actions) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.actions = Actions.convertToList(actions);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Directions getDirection() {
        return direction;
    }

    public void setDirection(Directions direction) {
        this.direction = direction;
    }

    public List<Actions> getActions() {
        return actions;
    }
}
