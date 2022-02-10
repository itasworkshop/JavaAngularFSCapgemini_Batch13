package com.mysite;

import java.util.Scanner;

//oops --> abstraction, encapsulation, inheritance and polymorphism
//encapsulation --> using getters and setters

class Calculator1{

    private int num1;
    private int num2;

    Calculator1(int a,int b){
        this.num1 = a;
        this.num2 = b;
    }

    public int getNum1() {
        return this.num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /*
    public void addition(){
        int result = this.num1 + this.num2;
        System.out.println(result);
    }*/

    public void addition(int a,int b){
        int result = a+b;
        System.out.println(a+b);
    }

    public void subtraction(){
        int result = this.num1 - this.num2;
        System.out.println(result);
    }
}

public class MyCalculator1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        Calculator1 mycalc = new Calculator1(n1,n2);
        mycalc.addition(67,34);
        mycalc.subtraction();

        mycalc.setNum1(50);
        mycalc.setNum2(50);
        mycalc.addition(20,12);
        mycalc.subtraction();
    }
}
