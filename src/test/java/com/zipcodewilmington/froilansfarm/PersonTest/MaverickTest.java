package com.zipcodewilmington.froilansfarm.PersonTest;

import com.zipcodewilmington.froilansfarm.FarmVehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Person.Maverick;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Test;

public class MaverickTest {
    @Test
    public void TestMaverickIsPerson(){
        //given
        Maverick maverick = new Maverick("Hiep Cruise");

        //when
        Assert.assertTrue(maverick instanceof Person);
    }

    @Test
    public void TestMaverickIsMaverick(){
        //given
        Maverick maverick = new Maverick("Hiep airboY");

        //when
        Assert.assertTrue(maverick instanceof Maverick);

    }

    @Test
    public void TestVehicleIsAircraft(){
        //given
        Maverick maverick = new Maverick("Hiepberto Cruize");

        //then
        CropDuster LilDusty = new CropDuster();

        maverick.fly(LilDusty);
        Aircraft expect = LilDusty;
        Aircraft actual = maverick.getAircraft();

        Assert.assertEquals(expect, actual);

    }
}
