package com.zipcodewilmington.froilansfarm.FarmVehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class CropDuster extends Vehicle implements Aircraft{
    //cropduster is a farmvehicle and aircraft which can fertilize a cropRow


    public boolean fly() {
        return true;
    }

    public boolean land() {
        return false;
    }

    public String makeNoise() {
        return "Meow";
    }

}
