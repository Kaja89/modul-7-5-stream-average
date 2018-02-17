package com.kodilla.modul75.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        ArrayOperator operator = new ArrayOperator();
        int [] myArray = {4, 5, 4, 5, 4, 5};

        //When
        double result = operator.getAverage(myArray);

        //Then
        Assert.assertEquals(4.5, result, 0);
    }
}
