package com.mysite;

//polymorphism --> using one thing in multiple ways
//overloading --> same name method with different type or number of parameter

class Calculator3{

    public void addition(int a,int b){
        System.out.println(a+b);
    }

    public void addition(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public void addition(float a,float b){
        System.out.println("from float one");
        System.out.println(a+b);
    }

    //return type has no impact on overloading
    /*
    public int addition(int a,int b){
        System.out.println(a+b);
        return a+b;
    }
     */
}

public class TestPolymorphism {
    public static void main(String[] args){
        Calculator3 obj = new Calculator3();
        obj.addition(2,5);
        obj.addition(2,4,6);
        obj.addition(2.5f, 3.5F);
    }
}
