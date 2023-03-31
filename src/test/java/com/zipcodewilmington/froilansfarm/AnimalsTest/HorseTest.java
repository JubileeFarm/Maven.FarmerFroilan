package com.zipcodewilmington.froilansfarm.AnimalsTest;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    //private Horse horse = new Horse();

    @Test
    public void TestMakeNoise(){
    Horse horsey = new Horse();
        Assert.assertEquals("Neeeeeighhh", horsey.makeNoise());
    }

    @Test
    public void TestEat(){

    }
}
