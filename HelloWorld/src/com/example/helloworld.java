package com.example;

import java.sql.Array;

public class helloworld {

    public static Integer findGreater(Integer first, Integer second)
    {
        return first > second ? first : second;
    }
    public static Integer findAverage(Integer first, Integer second)
    {
        return (first+second) / 2;
    }
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");
        final int MIN = 0;
        final int MAX = 100;
        int min_value = MIN;
        int max_value = MAX;

        System.out.println(findGreater(min_value, max_value));
        System.out.println(findAverage(min_value, max_value));

        int[] all_values = {min_value,max_value};
        for (Integer i : all_values )
        {
            System.out.println(i);
        }
    }
}

