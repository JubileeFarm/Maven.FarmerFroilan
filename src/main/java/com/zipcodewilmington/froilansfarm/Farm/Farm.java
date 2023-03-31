package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.FarmVehicle.FarmVehicle;
<<<<<<< HEAD

public class Farm {
    public Farm(Field field, ChickenCoop coop1, ChickenCoop coop2, ChickenCoop coop3, ChickenCoop coop4, Stable stable1, Stable stable2, Stable stable3, FarmVehicle vehicle1, FarmVehicle vehicle2) {
    }
=======
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;


import javax.swing.text.SimpleAttributeSet;
import java.util.ArrayList;

public class Farm {
    private Aircraft aircraft;
    private Field field;
    private ArrayList<ChickenCoop> coops;
    private ArrayList<Stable> stables;
    private ArrayList<FarmVehicle> vehicles;
    public Farm(Field field,
                 ChickenCoop coop1, ChickenCoop coop2, ChickenCoop coop3, ChickenCoop coop4,
                 Stable stable1, Stable stable2, Stable stable3,
                 FarmVehicle vehicle1, FarmVehicle vehicle2, Aircraft aircraft1){

        this.coops.add(coop1);
        this.coops.add(coop2);
        this.coops.add(coop3);
        this.coops.add(coop4);

        this.stables.add(stable1);
        this.stables.add(stable2);
        this.stables.add(stable3);

        this.vehicles.add(vehicle1);
        this.vehicles.add(vehicle2);

        this.aircraft = aircraft1;

    }

>>>>>>> zach
}
