package com.bridgelabz.largest;

public class LargestNumber<K extends Comparable> {
    public Integer inputNumber(Integer a,Integer b,Integer c)
    {
        Integer max=a;

        if(a.compareTo(b)<0)
            max=b;
        if(a.compareTo(c)<0)
            max=c;

        return max;
    }
    public Float inputNumber(Float a,Float b,Float c)
    {
        Float max=a;
        if(a.compareTo(b)<0)
            max=b;
        if (a.compareTo(c)<0)
            max=c;

        return max;
    }
    public String inputString(String a,String b,String c)
    {
        String max=a;
        if(a.compareTo(b)<0)
            max=b;
        if(a.compareTo(c)<0)
            max=c;

        return max;
    }
    public K checkLargest(K a,K b,K c)
    {
        K max=a;
        if(a.compareTo(b)<0)
            max=b;
        if(a.compareTo(c)<0)
            max=c;
        return max;
    }
}
