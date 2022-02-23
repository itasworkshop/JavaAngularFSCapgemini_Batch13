package org.java8new;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestConsumer {

    public static void main(String[] args){
        List<String> mylist = Arrays.asList("Raj","Suraj","Tom");

        //for each loop
        for (String i:mylist){
            System.out.println(i);
        }

        //after java 8 onwards we got a new real forEach method to iterate over items and performs provided action (lambda) over each item
        mylist.forEach(
                (Object o) -> System.out.println(o)
        );

    }
}
