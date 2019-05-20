package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CountStringTest
{
    public static CountString cs;

    @BeforeClass
    public static void setup()
    {
        //arrange
        cs = new CountString();
    }

    @AfterClass
    public static void teardown()
    {
        //arrange
        cs = null;
    }

    @Test
    public void countString_StringGiven_ShouldReturnHashMap()
    {
        //arrange
        String str = "one one -one___two,,three,one @three*one?two";
        Map<String, Integer> expected = new HashMap<String , Integer>();
        expected.put("one" , 5);
        expected.put("two" , 2);
        expected.put("three" , 2);
        Map actual = cs.count(str);
        assertEquals(expected, actual); //act and assert
    }
}