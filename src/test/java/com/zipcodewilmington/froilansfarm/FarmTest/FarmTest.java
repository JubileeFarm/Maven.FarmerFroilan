package com.zipcodewilmington.froilansfarm.FarmTest;

import com.zipcodewilmington.froilansfarm.Crop.ArbVegRow;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import com.zipcodewilmington.froilansfarm.Farm.Stable;
import com.zipcodewilmington.froilansfarm.FarmVehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Maverick;
import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.TomatoPlant;
import org.junit.Before;
import org.junit.Test;

public class FarmTest {
    private Field field;
    private CropRow row1, row2;
    private ArbVegRow row3;
    private ChickenCoop coop1, coop2, coop3, coop4;
    private Stable stable1, stable2, stable3;
    private FarmVehicle vehicle1, vehicle2;
    private Aircraft aircraft;
    private Maverick pilot;
    private Farmer farmer;

    @Before //before class is used to execute before all tests are ran
    public void setUp() {
       //establishing the farm to test based on setting the plot in readMe
        field = new Field();
        row1 = new CropRow(CornStalk);
        row2 = new CropRow(TomatoPlant);
        row3 = new ArbVegRow();
        coop1 = new ChickenCoop(4);
        coop2 = new ChickenCoop(4);
        coop3 = new ChickenCoop(4);
        coop4 = new ChickenCoop(3);
        stable1 = new Stable(4);
        stable2 = new Stable(4);
        stable3 = new Stable(2);
        vehicle1 = new FarmVehicle();
        vehicle2 = new FarmVehicle();
        aircraft = new Aircraft();
        pilot = new Pilot("Froilanda", aircraft);
        farmer = new Farmer("Froilan", field, coop1, coop2, coop3, coop4, stable1, stable2, stable3, vehicle1, vehicle2);
    }



    @Test
    public void TestAddStable(){
        //given
        //Farm farm = new Farm();
        //Stable stable = new stable();

        //when
        //farm.add(stable);

        //then
        //Assert.assertTrue(farm.get(stable));

    }

    @Test
    public void TestRemoveStable(){
        //given
        //Farm farm = new Farm()
        //Stable stable = new Stable();

        //when
        //stable.add(stable);
        //Assert.assertTrue(farm.get(stable));
        //stable.remove(horse);

        //then
        //Assert.assertFalse(farm.get(stable));
    }

    @Test
    public void TestAddVehicle(){
        //given
        //Farm farm = new Farm();
        //Vehicle vehicle = new Vehicle();

        //when
        //farm.add(vehicle);

        //then
        //Assert.assertTrue(farm.get(vehicle));

    }

    @Test
    public void TestRemoveVehicle(){
        //given
        //Farm farm = new Farm();
        //Vehicle vehicle = new Vehicle();

        //when
        //farm.add(vehicle);
        //farm.get(vehicle)
        //farm.remove(vehicle

        //then
        //Assert.assertFalse(farm.get(vehicle));
    }

    @Test
    public void TestAddChickenCoop(){
        //given
        //Farm farm = new Farm();
        //ChickenCoop chickenCoop = new ChickenCoop();

        //when
        //farm.add(chickenCoop);

        //then
        //Assert.assertTrue(farm.get(chickenCoop));
    }

    @Test
    public void TestRemoveChickenCoop(){
        //given
        //Farm farm = new Farm();
        //ChickenCoop chickenCoop = new ChickenCoop();

        //when
        //farm.add(chickenCoop);
        //farm.get(chickenCoop);
        //farm.remove(chickenCoop);

        //then
        //Assert.assertFalse(farm.get(chickenCoop));
    }
}
