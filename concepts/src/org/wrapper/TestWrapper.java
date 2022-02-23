package org.wrapper;

//premitive java -- int, float,double,char,byte,short,long,boolean -- not objects
//wrapper class -- Integer,Float,Double -- objects

public class TestWrapper {

    public static void main(String[] args){
        int a = 10; //basic type
        Integer b = 10; //object

        b = b +1; //unboxing

        b = a; //autoboxing

        System.out.println(a);
        System.out.println(b.toString());
    }

}
