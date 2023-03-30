package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Chicken extends Animal{ //implements Produce

    private boolean hasBeenFertilized;
    private String EdibleEgg;

    public Chicken(){
        if (hasBeenFertilized == true)
        this.hasBeenFertilized = false;
    }

}
