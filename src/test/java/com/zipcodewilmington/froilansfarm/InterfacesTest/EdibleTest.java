package com.zipcodewilmington.froilansfarm.InterfacesTest;

import com.zipcodewilmington.froilansfarm.Animals.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Broccoli;
import com.zipcodewilmington.froilansfarm.Produce.Corn;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class EdibleTest {


    @Test
    public void TestEgg(){
        Egg egg = new Egg();
        Assert.assertTrue(egg instanceof Edible);


    }

    @Test
    public void TestTomato(){
        Tomato tomato = new Tomato();
        Assert.assertTrue(tomato instanceof Edible);
    }

    @Test
    public void TestCorn(){
        Corn corn = new Corn();
        Assert.assertTrue(corn instanceof Edible);
    }

    @Test
    public void TestBroccoli(){
        Broccoli broccoli = new Broccoli();
        Assert.assertTrue(broccoli instanceof Edible);

    }
}
