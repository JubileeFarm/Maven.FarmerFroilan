package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Chicken extends Animal{ //implements Produce

    private boolean hasBeenFertilized;
    private boolean hasBeenCollected;
    private String EdibleEgg;
    private ArrayList<Egg> eggCollected;

    public Chicken(){
        this.eggCollected = new ArrayList<>();
        this.hasBeenFertilized = false;
    }

    public String makeNoise(){
        return "Cluck cluck";
    }

    public ArrayList yield(){
        hasBeenCollected = true;
        ArrayList<Egg> eggs = (ArrayList<Egg>) this.eggCollected.clone();
        this.eggCollected.clear();
        return eggs;
    }

    public void beFertilized(){
        this.hasBeenFertilized = true;
    }

}
