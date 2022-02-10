package com.mysite;

//overriding --> calls addition based on object not based on reference

class Calculator4{

    public void addition(int x,int y){
        System.out.println("from parent");
        System.out.println(x+y);
    }
}

class ScientificCalc1 extends Calculator4{

    public void addition(int x,int y){
        System.out.println("from child");
        System.out.println(x+y);
    }

}

public class TestOverriding {

    public static void main(String[] args){
        ScientificCalc1 obj = new ScientificCalc1();
        obj.addition(5,6);

        Calculator4 obj1 = new ScientificCalc1();
        obj1.addition(2,2);

        ScientificCalc1 obj3 = (ScientificCalc1) new Calculator4();
        obj3.addition(6,6);

        Calculator4 obj2 = new Calculator4();
        obj2.addition(3,3);
    }
}
