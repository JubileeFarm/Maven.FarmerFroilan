package com.zipcodewilmington.froilansfarm.VehicleTests;

import com.zipcodewilmington.froilansfarm.FarmVehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.FarmVehicle.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class FarmVehicleTests {
    @Test
    public void TestFarmVehicle(){
        FarmVehicle farmVehicle = new FarmVehicle();
        Assert.assertTrue(farmVehicle instanceof Vehicle);
    }
}
