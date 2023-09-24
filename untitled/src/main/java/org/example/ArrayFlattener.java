package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayFlattener {
    public List<Integer> flatten(List<List<Integer>> arrs){
       return Optional.ofNullable(arrs)
               .map(list->list.stream().flatMap(List::stream).collect(Collectors.toList()))
               .orElse(Collections.emptyList());
    }
}
