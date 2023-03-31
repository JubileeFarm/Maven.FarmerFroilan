package com.zipcodewilmington.froilansfarm.VehicleTests;

import com.zipcodewilmington.froilansfarm.FarmVehicle.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void TestMakeNoise(){
        Vehicle tommy = new Vehicle();
        Assert.assertEquals("Gasolina", tommy.makeNoise());
    }
}
