package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Maverick extends Person implements Rider {
    private Aircraft aircraft;
    public Maverick(String name){
        super(name);
    }

    public static Aircraft getAircraft(){
        return aircraft;
    }

    public void fly(Aircraft aircraft){
        this.aircraft = aircraft;
    }

    public void ride(Rideable rideable) {

    }

    public void dismount() {

    }

    public String makeNoise(){
        return "I'm scared of heights!";
    }
}
