package com.zipcodewilmington.froilansfarm.FarmVehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;

public class CropDuster implements Aircraft, FarmVehicle {
    //cropduster is a farmvehicle and aircraft which can fertilize a cropRow

  public static String MakeNoise(){
      return "brrrrr";
  }



    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean land() {
        return false;
    }
}
