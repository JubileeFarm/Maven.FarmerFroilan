package com.zipcodewilmington.froilansfarm.FarmTest;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crop.ArbVegRow;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import com.zipcodewilmington.froilansfarm.Farm.Stable;
import com.zipcodewilmington.froilansfarm.FarmVehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Maverick;
import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.TomatoPlant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmTest {
    private Farm farm;
    private Field field;
    private CropRow row1, row2;
    private ArbVegRow row3;
    private ChickenCoop coop1, coop2, coop3, coop4;
    private Stable stable1, stable2, stable3;
    private FarmVehicle vehicle1, vehicle2;
    private Aircraft aircraft;
    private Maverick pilot;
    private Farmer farmer;
    private CornStalk cornStalk;

    @Before
    public //before class is used to execute before all tests are ran
    void setUp() {
       //establishing the farm to test based on setting the plot in readMe
        field = new Field();
        field.add(new CropRow());
        field.add(new CropRow());
        field.add(new CropRow());

        coop1 = new ChickenCoop();
        coop1.add(new Chicken());
        coop1.add(new Chicken());
        coop1.add(new Chicken());
        coop1.add(new Chicken());

        coop2 = new ChickenCoop();
        coop2.add(new Chicken());
        coop2.add(new Chicken());
        coop2.add(new Chicken());
        coop2.add(new Chicken());

        coop3 = new ChickenCoop();
        coop3.add(new Chicken());
        coop3.add(new Chicken());
        coop3.add(new Chicken());

        coop4 = new ChickenCoop();
        coop4.add(new Chicken());
        coop4.add(new Chicken());
        coop4.add(new Chicken());

        stable1 = new Stable();
        stable1.add(new Horse());
        stable1.add(new Horse());
        stable1.add(new Horse());
        stable1.add(new Horse());

        stable2 = new Stable();
        stable2.add(new Horse());
        stable2.add(new Horse());
        stable2.add(new Horse());
        stable2.add(new Horse());

        stable3 = new Stable();
        stable2.add(new Horse());
        stable2.add(new Horse());

        pilot = new Maverick("Froilanda", aircraft);
        farm = new Farm(field, coop1, coop2, coop3, coop4, stable1, stable2, stable3, vehicle1, vehicle2);
    }

    @Test
    public void testFarmComponents() {
        Assert.assertEquals(5, field.getNumCropRows());
        Assert.assertEquals(row1, field.get(0));
        Assert.assertEquals(row2, field.get(1));
        Assert.assertEquals(row3, field.get(2));
        Assert.assertEquals(coop1, farmer.getChickenCoop(0));
        Assert.assertEquals(coop2, farmer.getChickenCoop(1));
        Assert.assertEquals(coop3, farmer.getChickenCoop(2));
        Assert.assertEquals(coop4, farmer.getChickenCoop(3));
        Assert.assertEquals(stable1, farmer.getStable(0));
        Assert.assertEquals(stable2, farmer.getStable(1));
        Assert.assertEquals(stable3, farmer.getStable(2));
        Assert.assertEquals(vehicle1, farmer.getFarmVehicle(0));
        Assert.assertEquals(vehicle2, farmer.getFarmVehicle(1));
        Assert.assertEquals(aircraft, pilot.getAircraft());
    }

}
