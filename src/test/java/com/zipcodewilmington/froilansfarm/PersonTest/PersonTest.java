package com.zipcodewilmington.froilansfarm.PersonTest;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Produce.Corn;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void constructorTest(){
     Person person = new Person("Zach");
     String expected = "Zach";
     String actual = person.getName();

     Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestEat(){
        Person person = new Person("Jen");
        Corn corn = new Corn();
        String actual = person.eat(corn);
        String expected = "Delicioso";

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestMakeNoise(){
        Person person = new Person("Andre");

        Assert.assertEquals("farttttt", person.makeNoise());
    }
}
