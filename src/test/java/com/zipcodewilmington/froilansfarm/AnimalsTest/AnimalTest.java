package com.zipcodewilmington.froilansfarm.AnimalsTest;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Produce.Corn;
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
        Corn corn = new Corn();

        String expected = "Yummy";
        String actual = animal.eat(corn);



       Assert.assertEquals(expected,actual);
    }


}
