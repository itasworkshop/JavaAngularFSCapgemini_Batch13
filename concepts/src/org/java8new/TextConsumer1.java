package org.java8new;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer{

    //it accepts one argument and returns nothing
    public void accept(Object o) {
        System.out.println("Hello from consumer."+o);
    }
}

public class TextConsumer1 {

    public static  void main(String[] args){

        //consumer means it will consume exactly one item and returns nothing
        Consumer c = (Object o) -> {System.out.println("hello from lambda consumer "+o);};

        Consumer c1 = new MyConsumer();

        List<String> mylist = Arrays.asList("Raj","Suraj","Tom");

        mylist.forEach(c);

        mylist.forEach(c1);

    }
}
