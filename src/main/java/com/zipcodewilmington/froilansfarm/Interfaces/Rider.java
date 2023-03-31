package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Rider<T extends Rideable>  {
    void ride(Rideable rideable);

    void dismount();
}
