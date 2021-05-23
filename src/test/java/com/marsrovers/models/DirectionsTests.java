package com.marsrovers.models;

import com.marsrovers.exceptions.InvalidDirectionException;
import org.junit.Test;

public class DirectionsTests {

    @Test(expected = InvalidDirectionException.class)
    public void directions_whenLetterIsInvalid_ThrowsException() {
    }

    @Test
    public void directions_whenLetterIsN_ReturnsNorth() {
    }

    @Test
    public void directions_whenLetterIsS_ReturnsSouth() {
    }

    @Test
    public void directions_whenLetterIsE_ReturnsEast() {
    }

    @Test
    public void directions_whenLetterIsW_ReturnsWest() {
    }
}
