package org.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream2 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 45, 23, 56, 78, 56, 89, 24);

        Stream<Integer> mystream = numbers.stream();

        Stream<Integer> myEvenStream = mystream.filter(i -> {

                System.out.println("inside filter lambda " + i);
                return i%2==0;
            }
        );

        //[2,56,78] wrong assumption
        System.out.println(myEvenStream);

        //in output like a factory belt we process only filtered items one after another
        myEvenStream.forEach(System.out::println);

    }
}
