package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public class Animal implements Eater, NoiseMaker {
    public String makeNoise() {
            return "noise";
        }

    @Override
    public String eat(Edible edible) {
        return "Yummy";
    }
}