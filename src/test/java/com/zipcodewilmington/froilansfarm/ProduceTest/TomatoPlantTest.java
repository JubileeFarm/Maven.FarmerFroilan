package com.zipcodewilmington.froilansfarm.ProduceTest;

import com.zipcodewilmington.froilansfarm.Produce.Produce;
import com.zipcodewilmington.froilansfarm.Produce.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {
    @Test
    public void TestTomatoPlant(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        Assert.assertTrue(tomatoPlant instanceof Produce);
    }
}
