package com.zipcodewilmington.froilansfarm.PersonTest;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Produce.Corn;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {


    @Test
    public void TestInstanceBotanist(){
    Person Farmer3 = new Person("Hiep");
    Assert.assertTrue(Farmer3 instanceof Person);

    }
    @Test
    public void TestBotanistTest(){
    Botanist Farmer2 = new Farmer("Dre");
    Assert.assertTrue(Farmer2 instanceof Botanist);

    }

    @Test
    public void TestInstanceFarmer(){
        Farmer Farmer = new Farmer("Zach");
        Assert.assertTrue(Farmer instanceof Farmer);

    }

    @Test
    public void TestEat(){
        Farmer farmer = new Farmer("Jen");
        Corn corn = new Corn();
        String actual = farmer.eat(corn);
        String expected = "Time to grub !";

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestMakeNoise(){
        Farmer farmer = new Farmer("Andre");

        Assert.assertEquals("Turn up the value", farmer.makeNoise());
    }
}

