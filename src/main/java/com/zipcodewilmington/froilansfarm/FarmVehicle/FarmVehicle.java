package com.zipcodewilmington.froilansfarm.FarmVehicle;

import com.zipcodewilmington.froilansfarm.Farm.Farm;

public abstract class FarmVehicle extends Vehicle{

    private Farm farm;

    public void operate(Farm farm) {
        this.farm = farm;
    }

    public Farm getFarm(){
        return farm;
    }

}
