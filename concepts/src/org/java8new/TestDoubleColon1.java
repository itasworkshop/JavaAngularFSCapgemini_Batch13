package org.java8new;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class MyPrinter{

    public static String printMe(String s){
        System.out.println(s);
        return s;
    }
}
public class TestDoubleColon1 {

    public static void main(String[] args) {
        List<String> mylist = Arrays.asList("Raj", "Suraj", "Tom");

       // MyPrinter obj = new MyPrinter();
       // mylist.forEach( i -> obj.printMe(i));

        mylist.forEach(MyPrinter::printMe);
    }
}
