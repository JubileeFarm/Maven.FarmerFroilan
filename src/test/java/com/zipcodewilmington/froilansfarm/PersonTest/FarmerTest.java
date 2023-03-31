package com.zipcodewilmington.froilansfarm.PersonTest;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
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
    public void TestEater(){
        Farmer Farmer = new Farmer("Tiger");
        Assert.assertTrue(Farmer instanceof Eater);
    }

}

