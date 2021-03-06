package com.marsrovers.models;

import com.marsrovers.exceptions.InvalidDirectionException;
import org.junit.Assert;
import org.junit.Test;

public class DirectionsTest {

    @Test(expected = InvalidDirectionException.class)
    public void directions_whenLetterIsInvalid_ThrowsException() {
        char directionChar = 'P';
        Directions.getDirection(directionChar);
    }

    @Test
    public void directions_whenLetterIsN_ReturnsNorth() {
        char directionChar = 'N';
        Directions expected = Directions.NORTH;

        Directions returnedDirection =  Directions.getDirection(directionChar);

        Assert.assertEquals(expected, returnedDirection);
    }

    @Test
    public void directions_whenLetterIsS_ReturnsSouth() {
        char directionChar = 'S';
        Directions expected = Directions.SOUTH;

        Directions returnedDirection =  Directions.getDirection(directionChar);

        Assert.assertEquals(expected, returnedDirection);
    }

    @Test
    public void directions_whenLetterIsE_ReturnsEast() {
        char directionChar = 'E';
        Directions expected = Directions.EAST;

        Directions returnedDirection =  Directions.getDirection(directionChar);

        Assert.assertEquals(expected, returnedDirection);
    }

    @Test
    public void directions_whenLetterIsW_ReturnsWest() {
        char directionChar = 'W';
        Directions expected = Directions.WEST;

        Directions returnedDirection =  Directions.getDirection(directionChar);

        Assert.assertEquals(expected, returnedDirection);
    }
}
