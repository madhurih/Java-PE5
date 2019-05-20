package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapBoolean
{
    public HashMap<String, Boolean> countString(String[] origin)
    {
        //Creating a HashMap object with elements of inputArray as keys and their count as values
        HashMap<String, Integer> elementCount = new HashMap<>();
        //checking every element of the inputArra
        for (String i : origin)
        {
            if(elementCount.containsKey(i))
            {
                //If element is present in elementCountMap, incrementing it's count by 1

                elementCount.put(i, elementCount.get(i)+1);
            }
            else
            {
                //If element is not present in elementCountMap,
                //adding this element to elementCountMap with 1 as it's value

                elementCount.put(i, 1);
            }
        }
        HashMap<String, Boolean> map = new HashMap<>();
        for (Entry<String, Integer> entry : elementCount.entrySet())
        {
            if (entry.getValue() > 1)
            {
                map.put(entry.getKey(), true);
            }
            else
            {
                map.put(entry.getKey(), false);
            }
        }
        return map;
    }
}