package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Eater<T extends Edible> {
    String eat(T edible);
}