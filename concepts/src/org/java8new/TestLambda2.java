package org.java8new;

@FunctionalInterface
interface Printer{
    //abstract method
    void printMe(Object o); //Object class is parent of all class in java
}

public class TestLambda2 {

    public static void add(int a1,int a2,Printer printer){
        Integer sum = a1 + a2; //int vs Integer
        printer.printMe(sum);
    }

    public static void main(String[] args){

        int num1 = 10;
        int num2 = 20;

        Printer printer = (Object o) -> {
            System.out.printf("The result of %d and %d is %d",num1,num2,o);
        };

        add(num1,num2,printer);

    }

}
