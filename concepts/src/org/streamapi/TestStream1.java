package org.streamapi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestStream1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 45, 23, 56, 78, 56, 89, 24);

        //System.out.println(numbers);
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);

        //map,reduce and filter functional programming methods
        //map --> mapping intput items with same number of output items after applying some operation
        //numbers1.stream().map( i -> i+2).forEach(j -> System.out.println(j));

        //System.out.println(numbers1.stream().reduce((i,j) -> i+j).get());

        numbers1.stream().filter( i -> i%2==0).forEach(j -> System.out.println(j));

        //System.out.println(numbers);

    }
}
