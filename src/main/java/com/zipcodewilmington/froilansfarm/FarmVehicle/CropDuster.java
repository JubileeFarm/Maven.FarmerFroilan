package com.zipcodewilmington.froilansfarm.FarmVehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public class CropDuster implements Aircraft, FarmVehicle, NoiseMaker {
    //cropduster is a farmvehicle and aircraft which can fertilize a cropRow


    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean land() {
        return false;
    }


    public String makeNoise() {
        return "Meow";
    }
}
