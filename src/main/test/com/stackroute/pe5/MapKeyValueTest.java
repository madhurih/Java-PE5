package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MapKeyValueTest
{
    public static MapKeyValue mk;

    @BeforeClass
    public static void setup()
    {
        //arrange
        mk = new MapKeyValue();
    }

    @AfterClass
    public static void teardown()
    {
        //arrange
        mk = null;
    }

    @Test
    public void countString_StringArrayGiven_ShouldReturnHashMap()
    {
        //arrange
        Map<String, String> input = new HashMap<>();
        input.put("val1" , "Madhuri");
        input.put("val2" , "Hire");
        System.out.println(input);
        Map<String, String> expected = new HashMap<>();
        expected.put("val1", " ");
        expected.put("val2", "Madhuri");
        System.out.println(expected);
        Map actual = mk.MapString(input);
        assertEquals(expected, actual); //act and assert
    }
}
