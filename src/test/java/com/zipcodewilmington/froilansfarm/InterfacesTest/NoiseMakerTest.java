package com.zipcodewilmington.froilansfarm.InterfacesTest;

import com.zipcodewilmington.froilansfarm.FarmVehicle.Tractor;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import org.junit.Assert;
import org.junit.Test;

public class NoiseMakerTest {
    @Test
    public void NoiseMakerTest(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof NoiseMaker);
    }
}
