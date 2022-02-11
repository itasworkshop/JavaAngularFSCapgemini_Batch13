package com.mysite;

//total contract between implementing class n interface
interface MyInterface{

    default void printMe(){
        System.out.println("hello from default one from first.");
    }

    void printMe1();

    //will not have concrete methods
    /*
    void display(){
        System.out.println("hello from concrete in interface.");
    }
     */
}

interface MySecondInterface{

    //void printMe();

    default void printMe(){
        System.out.println("hello from default one from second.");
    }

    void printHim();
}

class Student2 implements MyInterface,MySecondInterface{

    /*public void printMe() {
        System.out.println("Hello from printMe Student");
    }*/


    @Override
    public void printMe() {
        MySecondInterface.super.printMe();
    }

    @Override
    public void printMe1() {

    }

    @Override
    public void printHim() {
        System.out.println("Hello from printHim Student");
    }
}

public class TestInterface {

    public static void main(String[] args){
        Student2 obj = new Student2();
        obj.printMe();

    }
}
