package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayFlattenerTesting {
    private ArrayFlattener arrayFlattener=new ArrayFlattener();

    @BeforeAll
    public static void before(){

    }

    @Test
    public void testForValidDimArrayInput(){
        List<List<Integer>> input=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(3);
        List<Integer> list2=new ArrayList<>();
        list2.add(0);
        List<Integer> list3=new ArrayList<>();
        list3.add(4);
        list3.add(5);
        list3.add(9);
        input.add(list1);
        input.add(list2);
        input.add(list3);

        List<Integer> output=new ArrayList<>();
        output.add(1);
        output.add(3);
        output.add(0);
        output.add(4);
        output.add(5);
        output.add(9);
        assertEquals(arrayFlattener.flatten(input),output);

    }
    @Test
    public void TestingNullArrayInput(){
        assertEquals(arrayFlattener.flatten(null),null);
    }
}
