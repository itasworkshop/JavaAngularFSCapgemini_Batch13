package org.java8new;

//java 8
//what are the new features in Java8?
//1. Lambda Expression
//2. Functional Interface
//3. Interface --> can java interface have concrete method? -- static method and default methods
//4. stream API --> for supporting functional programming aspects
//5. Date and Time API changes

//Functional Interface
//interface with exactly one method --> Runnable, Comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

//POJO
class Student{

    private int rollno;
    private String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //String reprentation of object

    public String toString(){
        return this.getName();
    }

    //whether two object are equal to each other or not
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno && name.equals(student.name);
    }

    //for better performance
    @Override
    public int hashCode() {
        return Objects.hash(rollno, name);
    }

}

public class TestJava8 {

    public static  void main(String[] args){
        Student s1 = new Student(101,"Rajesh");
        Student s2 = new Student(102,"Suraj");
        Student s3 = new Student(103,"John");
        Student s4 = new Student(104,"Tom");

        ArrayList<Student> mylist = new ArrayList<>();
        mylist.add(s1);
        mylist.add(s2);
        mylist.add(s3);
        mylist.add(s4);

        ArrayList<String> mylist1 = new ArrayList<>();
        mylist1.add("Sumit");
        mylist1.add("Rishabh");
        mylist1.add("TejPratap");
        mylist1.add("Anil");

        //For String sorting based on name alphabatical is already available but for student class we need to give logic
        //System.out.println(mylist1);

        //Collections.sort(mylist1);

        //System.out.println(mylist1);



    }
}
