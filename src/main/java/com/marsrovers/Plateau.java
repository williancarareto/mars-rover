package com.marsrovers;

import com.marsrovers.exceptions.CollisionException;
import com.marsrovers.exceptions.InvalidCoordinatesException;
import com.marsrovers.exceptions.OutOfPlateauException;
import com.marsrovers.models.Rover;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

    private int x;
    private int y;
    private List<Rover> rovers;

    public Plateau(int x, int y) {
        if (!isCoordinatesValid(x, y)) {
            throw new InvalidCoordinatesException("Invalid position creating plateau on x: " + x + " and y: " + y);
        }

        this.x = x;
        this.y = y;
        this.rovers = new ArrayList<>();
    }

    public void browseRovers() {

    }

    public void registerRover(Rover rover) {
        if (!isRoverInsidePlateauLimits(rover)) {
            throw new OutOfPlateauException("Rover is out of the plateau limits. Plateau limits x,y: "
                    + x + ", " + y + ". Rover x, y: " + x + ", " + y);
        }

        checkCollision(rover);
        rovers.add(rover);
    }

    public List<Rover> getRovers() {
        return rovers;
    }

    private boolean isCoordinatesValid(int x, int y) {
        return x > 0 && y > 0;
    }

    private boolean isRoverInsidePlateauLimits(Rover rover) {
        return rover.getX() <= x && rover.getY() <= y;
    }

    private void checkCollision(Rover currentRover){
        for (Rover rover: rovers) {
            if (rover.getX() == currentRover.getX() && rover.getY() == currentRover.getY()){
                throw new CollisionException("Collision between rovers in x,y: " + x + ", " + y);
            }
        }
    }
}
