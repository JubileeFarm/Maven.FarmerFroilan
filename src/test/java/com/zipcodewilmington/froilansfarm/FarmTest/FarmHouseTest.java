package com.zipcodewilmington.froilansfarm.FarmTest;

import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmHouseTest {
    @Test
    public void TestFarmHouse(){
      FarmHouse list = new FarmHouse();
        Person person = new Person("Hiep");

        list.add(person);
        Boolean actual = list.contains(person);

        Assert.assertTrue(actual);

    }
}
