package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ArrayReversorTesting {
    @Mock
    private ArrayFlattener arrayFlattener;

    @InjectMocks
    private ArrayReversor arrayReversor=new ArrayReversor();

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testingValidationRowsDimArrayInput(){
        List<List<Integer>> inputVal=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(3);
        List<Integer> list2=new ArrayList<>();
        list2.add(0);
        List<Integer> list3=new ArrayList<>();
        list3.add(4);
        list3.add(5);
        list3.add(9);
        inputVal.add(list1);
        inputVal.add(list2);
        inputVal.add(list3);

        List<Integer> output =new ArrayList<>();
        output.add(9);
        output.add(4);
        output.add(5);
        output.add(3);
        output.add(1);
        output.add(0);

        List<Integer> flattenOutputVal=new ArrayList<>();
        flattenOutputVal.add(1);
        flattenOutputVal.add(3);
        flattenOutputVal.add(0);
        flattenOutputVal.add(4);
        flattenOutputVal.add(5);
        flattenOutputVal.add(9);
        when(arrayFlattener.flatten(inputVal)).thenReturn(flattenOutputVal);

        assertEquals(arrayReversor.reverseArray(inputVal),output);

    }
    @Test
    public void testForNullArrayInput(){
        assertEquals(arrayReversor.reverseArray(null),null);
    }
}
