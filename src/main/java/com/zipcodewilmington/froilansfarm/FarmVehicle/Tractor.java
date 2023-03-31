package com.zipcodewilmington.froilansfarm.FarmVehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public class Tractor extends Vehicle implements NoiseMaker {
    // is a farm vehicle which can harvest a crop

    @Override
    public String makeNoise() {
        return "Woof";
    }
}
