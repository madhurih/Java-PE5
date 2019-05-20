package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class SetInterfaceTest
{
    public static SetInterface st;

    @BeforeClass
    public static void setup()
    {
        //arrange
        st = new SetInterface();
    }

    @AfterClass
    public static void teardown()
    {
        //arrange
        st = null;
    }

    @Test
    public void countString_StringArrayGiven_ShouldReturnHashMap()
    {
        //arrange
        Set<String> ts = new HashSet<>();
        ts.add("Harry");
        ts.add("Olive");
        ts.add("Alice");
        ts.add("Bluto");
        ts.add("Eugene");
        System.out.println(ts);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        System.out.println(expected);
        ArrayList<String> actual = st.sortAndConvert(ts);
        assertEquals(expected, actual); //act and assert
    }
}