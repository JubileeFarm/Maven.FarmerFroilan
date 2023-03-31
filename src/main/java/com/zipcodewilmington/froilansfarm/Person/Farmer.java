package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import com.zipcodewilmington.froilansfarm.Farm.Stable;
import com.zipcodewilmington.froilansfarm.FarmVehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Farmer extends Person implements Botanist {
    public Farmer(String name) {
        super(name);
    }

    @Override
    public String eat(Edible edible) {
        return "Time to grub !";
    }

    @Override
    public String makeNoise() {
        return "Turn up the value";
    }

//    @Override
//    public void plant(Class cropClass, CropRow cropRow) {
//        super.plant(cropClass, cropRow);

    }
}
