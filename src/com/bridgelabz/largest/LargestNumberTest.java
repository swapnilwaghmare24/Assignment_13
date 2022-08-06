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
    @Test
    public void checkFloatLargest()
    {
        LargestNumber largestNumber = new LargestNumber();
        float actualResult=largestNumber.inputNumber(5.2f,1.2f,9.3f);
        assertEquals(9.3f,actualResult,0);
    }

    @Test
    public void checkStringLargest()
    {
        LargestNumber largestNumber = new LargestNumber();
        String actualResult=largestNumber.inputString("Apple","Peach","Banana");
        assertEquals("Banana",actualResult);
    }

    @Test
    public void checkLargestInt() {
        LargestNumber<Integer> largestNumber = new LargestNumber<Integer>();
        int actualResult = largestNumber.checkLargest(1, 5, 8);
        assertEquals(8, actualResult);
    }
    @Test
    public void checkLargestFloat() {
        LargestNumber<Float> largestNumber = new LargestNumber<Float>();
        float actualResult = largestNumber.checkLargest(3.5f, 1.8f, 2.2f);
        assertEquals(3.5f, actualResult,0);
    }
    @Test
    public void checkLargestString()
    {
        LargestNumber<String> largestNumber=new LargestNumber<String>();
        String actualResult=largestNumber.checkLargest("Apple","Peach","Banana");
        assertEquals("Banana",actualResult);

    }
}
