package com.zipcodewilmington.froilansfarm.AnimalsTest;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest {

    private Animal animal = new Animal();


    @Test
    public void TestMakeNoise(){

        Assert.assertEquals("noise" , animal.makeNoise());
    }

    @Test
    public void TestEat(){

        //then
       // Assert.assertEquals(animal.eat(Put something here));
    }


}
