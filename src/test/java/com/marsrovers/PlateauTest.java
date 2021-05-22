package com.marsrovers;

import org.junit.Assert;
import org.junit.Test;

public class PlateauTest {

    //checking max plateau size on x pointer: x max = 5
    @Test
    public void getting_plateau_size_point_x(){
        int x = 5;
        int getPlateau = Plateau.plateauSizeX(x);
        Assert.assertEquals(getPlateau, x);
    }

    //checking max plateau size on y pointer y max = 5
    @Test
    public void getting_plateau_size_point_y(){
        int y = 5;
        int getPlateau = Plateau.plateauSizeY(y);
        Assert.assertEquals(getPlateau, y);
    }
}
