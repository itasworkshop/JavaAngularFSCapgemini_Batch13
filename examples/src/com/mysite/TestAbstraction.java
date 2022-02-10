package com.mysite;

//abstraction --> only overview/abstract part

abstract class RBILoanCalculator{

    //abstract method --> just signature no body
    abstract void emiCalculator(int rate);

    //non abstract
    public void printMe(){
        System.out.println("hey from non abstract");
    }
}

class SBIBank extends RBILoanCalculator{

    @Override
    void emiCalculator(int rate) {
        System.out.println("here is calculation of SBI bank."+rate);
    }
}

class HDFCBank extends RBILoanCalculator{

    @Override
    void emiCalculator(int rate) {
        System.out.println("here is calculation of HDFC bank."+rate);
    }
}


public class TestAbstraction {

    public static void main(String[] args){
        SBIBank obj = new SBIBank();
        obj.emiCalculator(5);
        obj.printMe();

        HDFCBank obj1 = new HDFCBank();
        obj1.emiCalculator(9);
        obj1.printMe();
    }
}
