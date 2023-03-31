package com.zipcodewilmington.froilansfarm.AnimalsTest;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {


    @Test
    public void TestMakeNoise(){
        Chicken chicken = new Chicken();

        Assert.assertEquals("Cluck cluck", chicken.makeNoise());
    }

    @Test
    public void TestYield(){
        //given

        //when

        //then

    }

    @Test
    public void TestFertilize(){
        Chicken chicken = new Chicken();
        //given
        chicken.beFertilized();

        //when

        //then
        Assert.assertEquals(0, chicken.yield().size());
    }

    @Test
    public void TestEgg(){
        Egg egg = new Egg();
        Assert.assertTrue(egg instanceof Edible);
    }
}

