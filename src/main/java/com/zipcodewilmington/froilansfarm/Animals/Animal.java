package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public abstract class Animal<T extends Edible> implements Eater<T>, NoiseMaker {
    public String makeNoise() {
            return "noise";
        }

    @Override
    public String eat(T edible) {
        return "Yummy";
    }
}