package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class UpdateArrayTest
{
    public static UpdateArray ua;

    @BeforeClass
    public static void setup()
    {
        //arrange
        ua = new UpdateArray();
    }

    @AfterClass
    public static void teardown()
    {
        //arrange
        ua = null;
    }

    @Test
    public void updateArrayElement_ArrayListGiven_ShouldReturnUpdatedArrayList()
    {
        //arrange
        ArrayList<String> list = new ArrayList<String>(); //Creating arraylist
        list.add("Apple");  //Adding object in arraylist
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Kiwi");  //Adding object in arraylist
        expected.add("Grape");
        expected.add("Mango");
        expected.add("Berry");
        assertEquals(expected, ua.updateArrayElement(list)); //act and assert
    }
}