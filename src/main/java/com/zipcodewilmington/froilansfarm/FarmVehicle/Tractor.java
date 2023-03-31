package com.zipcodewilmington.froilansfarm.FarmVehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public class Tractor extends FarmVehicle implements NoiseMaker {
    // is a farm vehicle which can harvest a crop
    void harvest(){}

    @Override
    public String makeNoise() {
        return "Woof";
    }
}
