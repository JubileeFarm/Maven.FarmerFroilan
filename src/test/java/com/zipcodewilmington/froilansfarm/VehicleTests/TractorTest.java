package com.zipcodewilmington.froilansfarm.VehicleTests;

import com.zipcodewilmington.froilansfarm.FarmVehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.FarmVehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.FarmVehicle.Tractor;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {
    @Test
    public void TestTractor() {
        Tractor CutiePie = new Tractor();
        Assert.assertTrue(CutiePie instanceof Tractor);
        }

    @Test
    public void TestFarmVehicle(){
            Tractor CutiePie = new Tractor();
            Assert.assertTrue(CutiePie instanceof FarmVehicle);
        }
    @Test
    public void TestNoiseMaker(){
        Tractor CutiePie = new Tractor();
        Assert.assertTrue(CutiePie instanceof NoiseMaker);
    }
    @Test
    public void TestRideable(){
        Tractor CutiePie = new Tractor();
        Assert.assertTrue(CutiePie instanceof Rideable);
    }

    @Test
    public void MakeNoiseTest(){
        Tractor CutiePie = new Tractor();
        Assert.assertEquals("RoarRoar", CutiePie.makeNoise());
    }
}
