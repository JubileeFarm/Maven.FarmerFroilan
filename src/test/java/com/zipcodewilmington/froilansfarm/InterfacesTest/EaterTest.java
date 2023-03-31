package com.zipcodewilmington.froilansfarm.InterfacesTest;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import org.junit.Assert;
import org.junit.Test;

public class EaterTest {

    @Test
    public void TestEater(){
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Eater);
    }
}
