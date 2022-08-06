package com.bridgelabz.largest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestNumberTest {
    @Test
    public void checkIntegerLargest()
    {
        LargestNumber largestNumber = new LargestNumber();
        int actualReult=largestNumber.inputNumber(5,8,2);
        assertEquals(8,actualReult);

    }
}
