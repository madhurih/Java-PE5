package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapKeyValue
{
    public HashMap<String, String> MapString(Map<String, String> origin)
    {
        HashMap<String, String> result = new HashMap<>();
        for (Entry<String, String> entry : origin.entrySet())
        {
            if(entry.getValue() != " ")
            {
                result.put("val1", " ");
                result.put("val2", "Madhuri");
            }
        }
        return result;
    }
}