package com.mysite;

import java.util.Scanner;

class Calculator{

    int num1;
    int num2;

    Calculator(int a,int b){
        this.num1 = a;
        this.num2 = b;
    }

    public void addition(){
        int result = this.num1 + this.num2;
        System.out.println(result);
    }

    public void subtraction(){
        int result = this.num1 - this.num2;
        System.out.println(result);
    }
}

public class MyCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        Calculator mycalc = new Calculator(n1,n2);
        mycalc.addition();
        mycalc.subtraction();
    }
}
