package com.marsrovers;

import com.marsrovers.models.Rover;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

    private int x;
    private int y;
    private List<Rover> rovers;

    public Plateau(int x, int y) {
        this.x = x;
        this.y = y;
        this.rovers = new ArrayList<>();
    }

    public void browseRovers(){

    }

    public void registerRover(Rover rover){

    }

    public List<Rover> getRovers() {
        return rovers;
    }
}
