package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Person implements Rider, Eater {
    private String name;
    private Rideable whip;
    public Person(String name){
      this.name = name;
    }
    public String getName(){
        return name;
    }
    public String eat(Edible edible){
        return "Delicioso";
    }

    public String makeNoise(){
        return "farttttt";
    }

    @Override
    public void ride(Rideable rideable) {

    }

    @Override
    public void dismount() {

    }
    public Rideable whip(){
        return this.whip;
    }

}
