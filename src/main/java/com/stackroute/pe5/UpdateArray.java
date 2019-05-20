package com.stackroute.pe5;

import java.util.ArrayList;

public class UpdateArray
{
    public ArrayList updateArrayElement(ArrayList oldList)
    {
        System.out.println(oldList);
        ArrayList<Object> newList = new ArrayList<>() ;

        for (int i = 0 ; i < oldList.size(); i++)
        {
            newList.add(oldList.get(i)) ;
        }
        newList.set(0, "Kiwi");
        newList.set(2, "Mango");
        System.out.println(newList);
        oldList.clear();
        System.out.println("Array list after removing all elements" +oldList);
        return newList;
    }
}