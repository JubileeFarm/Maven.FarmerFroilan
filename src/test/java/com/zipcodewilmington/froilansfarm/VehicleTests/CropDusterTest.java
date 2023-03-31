package com.zipcodewilmington.froilansfarm.VehicleTests;

import com.zipcodewilmington.froilansfarm.FarmVehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {
    @Test
    public void TestCropDuster(){
        CropDuster DusterBoi = new CropDuster();
        Assert.assertTrue(DusterBoi instanceof Aircraft);
    }

    @Test
    public void TestCropDuster2(){
        CropDuster DusterBoi = new CropDuster();
        Assert.assertTrue(DusterBoi instanceof Rideable);
    }

    @Test
    public void TestCropInstanceOf(){
        CropDuster DusterBoi = new CropDuster();
        Assert.assertEquals(DusterBoi instanceof NoiseMaker);
    }

    @Test
    public void TestNoise(){
        Assert.assertEquals("Some String", CropDuster.makeNoise());
    }

    @Test
    public void TestLanding(){
        CropDuster DusterBoi = new CropDuster();
        Assert.assertTrue(DusterBoi.fly());
    }
    @Test
    public void flyTest(){
        CropDuster DusterBoi = new CropDuster();
        DusterBoi.fly();
        DusterBoi.land();
        Assert.assertFalse(DusterBoi.land());
    }
}
