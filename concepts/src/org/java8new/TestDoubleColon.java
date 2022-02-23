package org.java8new;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class EvenOdd{

    public static boolean isEven(int i){
        return i%2==0;
    }

    public static boolean isOdd(int i){
        return !isEven(i);
    }
}

public class TestDoubleColon {

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
       // obj.isEven(i);


        List<Integer> numbers = new LinkedList<>(Arrays.asList(2, 3, 45, 23, 56, 78, 56, 89, 24));

        System.out.println(numbers);

        //both of the below codes are same for lambda of Predicate(it performs test on object returns boolean
        //numbers.removeIf( i -> i%2==0);
        //numbers.removeIf( (i) -> { return i%2==0; });

        numbers.removeIf(EvenOdd::isEven);

        System.out.println(numbers);

        for (Integer i:numbers) {
            //System.out.println(i);
        }

        //below two codes are same
       // numbers.forEach(System.out::println);
        numbers.forEach( i -> System.out.println(i));

        numbers.forEach( i -> System.out.println(i*i));

    }
}
