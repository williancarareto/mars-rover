package com.marsrovers;

import org.junit.Assert;
import org.junit.Test;

public class PlateauTest {

    @Test
    public void getting_plateau_size_point_x(){
        int x = 5;
        int getPlateau = Plateau.plateauSizeX(x);
        Assert.assertEquals(getPlateau, x);
    }

    @Test
    public void getting_plateau_size_point_y(){
        int y = 5;
        int getPlateau = Plateau.plateauSizeY(y);
        Assert.assertEquals(getPlateau, y);
    }
}
