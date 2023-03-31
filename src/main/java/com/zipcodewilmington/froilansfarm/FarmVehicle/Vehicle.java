package com.zipcodewilmington.froilansfarm.FarmVehicle;

import com.zipcodewilmington.froilansfarm.FarmVehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Vehicle implements Rideable, NoiseMaker {

    @Override
    public String makeNoise() {
        return "Gasolina";
    }

    //Are noiseMaker and Rideable
}
