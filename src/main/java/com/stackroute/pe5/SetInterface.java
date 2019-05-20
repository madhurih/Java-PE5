package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface
{
    public ArrayList<String> sortAndConvert(Set input)
    {
        Set<String> sorted = new TreeSet<String>(input);
        System.out.println("Sorted Set: " + sorted);
        ArrayList<String> al = new ArrayList<>();
        al.addAll(sorted);
        System.out.println("from set:"+ al);
        return al;
    }
}
