package com.zipcodewilmington.froilansfarm.FarmVehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class CropDuster implements Aircraft, NoiseMaker, Rideable {
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

    @Override
    public void ride() {

    }
}
