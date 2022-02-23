package org.java8new;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//for giving logic of comparing/sorting
class MyStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class TestComparator {

    public static  void main(String[] args) {
        Student s1 = new Student(101, "Rajesh");
        Student s2 = new Student(102, "Suraj");
        Student s3 = new Student(103, "John");
        Student s4 = new Student(104, "Tom");

        ArrayList<Student> mylist = new ArrayList<>(); //no type safety without generic
        mylist.add(s1);
        mylist.add(s2);
        mylist.add(s3);
        mylist.add(s4);

        System.out.println(mylist);

        Collections.sort(mylist,new MyStudentComparator());

        System.out.println(mylist);
    }
}
