package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.FarmVehicle.Vehicle;
import com.zipcodewilmington.froilansfarm.Person.Maverick;

public interface Aircraft<T extends Maverick> extends Rideable {

    //is a vehichle which can fly


    boolean fly();


    boolean land();


}
