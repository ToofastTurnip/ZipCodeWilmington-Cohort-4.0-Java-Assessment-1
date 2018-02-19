package com.zipcodewilmington.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtilsTest {
    @Test
    public void getSumTest() {
        // : Given
        Integer input = 5;
<<<<<<< HEAD
        Integer expected = 10;
=======
        Integer expected = 15;
>>>>>>> f476f0b621b52d7eb0a7e901f81b829891aeff98

        // : When
        Integer actual = IntegerUtils.getSumOfN(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetProduct() {
        // : Given
        Integer input = 5;
        Integer expected = 24;

        // : When
        Integer actual = IntegerUtils.getProductOfN(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseDigitsTest() {
        // : Given
        Integer input = 12345;
        Integer expected = 54321;

        // : When
        Integer actual = IntegerUtils.reverseDigits(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }
}
