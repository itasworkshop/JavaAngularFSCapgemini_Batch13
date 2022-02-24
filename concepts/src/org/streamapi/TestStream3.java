package org.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TestStream3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 45, 23, 56, 78, 56, 89, 24);

        Stream<Integer> myEvenStream = numbers.stream().filter(i -> {

                    //System.out.println("inside filter lambda " + i);
                    return i%2==0;
                }
        );

        //Optional --> container object which may or may non null values.

        Optional<Integer> myopt = myEvenStream.findFirst();
        System.out.println(myopt.get());


    }
}
