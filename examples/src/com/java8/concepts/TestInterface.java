package com.java8.concepts;

//total contract between implementing class n interface
interface CollegeHireable {

    void suitableToHire(int marks,String comm_grade,int lpa);

}

class FacebookHR implements CollegeHireable{

    @Override
    public void suitableToHire(int marks, String comm_grade, int lpa) {
        if (marks >= 60 && comm_grade =="A" && lpa <=50){
            System.out.println("Congratulation! You are hired by Facebook.");
        }else {
            System.out.println("Better luck next time!");
        }
    }
}

class GoogleHR implements CollegeHireable{

    @Override
    public void suitableToHire(int marks, String comm_grade, int lpa) {
        if (marks >= 90 && comm_grade =="A" && lpa <=100){
            System.out.println("Congratulation! You are hired by Google.");
        }else {
            System.out.println("Better luck next time!");
        }
    }
}

public class TestInterface {

    public static void main(String[] args){
        FacebookHR fb = new FacebookHR();
        fb.suitableToHire(75,"A",35);

    }
}
