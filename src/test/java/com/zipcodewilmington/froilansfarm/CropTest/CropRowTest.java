package com.zipcodewilmington.froilansfarm.CropTest;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Field;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CropRowTest {

    @Test
    public void TestInstanceCropRow(){
       CropRow cr = new CropRow();
       Assert.assertTrue(cr instanceof ArrayList);
    }



}
