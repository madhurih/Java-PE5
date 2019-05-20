package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MapBooleanTest
{
    public static MapBoolean mb;

    @BeforeClass
    public static void setup()
    {
        //arrange
        mb = new MapBoolean();
    }

    @AfterClass
    public static void teardown()
    {
        //arrange
        mb = null;
    }

    @Test
    public void countString_StringArrayGiven_ShouldReturnHashMap()
    {
        //arrange
        String[] str = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> expected = new HashMap<String , Boolean>();
        expected.put("a" , true);
        expected.put("b" , false);
        expected.put("c" , true);
        expected.put("d" , false);
        System.out.println(expected);
        Map actual = mb.countString(str);
        assertEquals(expected, actual); //act and assert
    }
}
