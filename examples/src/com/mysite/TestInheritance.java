package com.mysite;

//IS-A relationship and HAS-A relationship

//inheritance --> taking parent's properties
//multi level inheritance --> Grandparent --> Parent --> child
//multiple inheritance --> having two parent classess

class Calculator2{
    int x;

    public void addition(int x,int y){
        System.out.println(x+y);
    }
}

class ScientificCalc extends Calculator2{
    //Calculator2 calc;

    public void areaCube(int side){
        System.out.println(side*side);
    }
}

public class TestInheritance{

    public static void main(String[] args){
        //child --> parent
        //3. Internally casting is taking place so becomes parent and no access to child properties
        Calculator2 obj1 = new ScientificCalc();
        //obj1.areaCube(5);

        //parent --> child
        ScientificCalc obj = (ScientificCalc) new Calculator2();
        obj.areaCube(6);


        /*
        //2. Child will have acess to both parent's and its own
        ScientificCalc obj = new ScientificCalc();
        obj.areaCube(5);
        obj.addition(23,34);

        //1. parent will have access to only its own
        Calculator2 parent = new Calculator2();
        parent.addition(23,34);
        */
    }
}
