package com.zipcodewilmington.froilansfarm.ProduceTest;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.Produce;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {
    @Test
    public void TestInstanceCrop() {

         CornStalk cornStalk = new CornStalk();

       Assert.assertTrue(cornStalk instanceof Produce);

    }
}