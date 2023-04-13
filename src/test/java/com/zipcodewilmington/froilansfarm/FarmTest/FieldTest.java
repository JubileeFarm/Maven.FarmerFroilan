package com.zipcodewilmington.froilansfarm.FarmTest;

import com.zipcodewilmington.froilansfarm.Farm.Field;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {
    @Test
    public void testGetNumberofCropRows(){
        Field field = new Field();
        int expected = 5;
        int actual = field.getNumCropRows();

        Assert.assertEquals(expected, actual);
    }
}
