package org.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.jar.Pack200;
import java.util.stream.Collectors;

class Person{
    private String fname;
    private String lname;

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}

public class TestStream4 {

    public static void main(String[] args) {
        Person p1 = new Person("Rajesh","Sharma");
        Person p2 = new Person("Raj","Sharma");
        Person p3 = new Person("Suraj","Verma");
        Person p4 = new Person("Lata","Singh");

        List<Person> mylist = Arrays.asList(p1,p2,p3,p4);

        //groupBy --> aggregate --> count(), sum(), min(), max(), avg()
        //based on collector logic it collects
        //Map<String,List<Person>> group =  mylist.stream().collect(Collectors.groupingBy(Person::getLname));

        Object result =  mylist.stream().collect(Collectors.groupingBy(Person::getLname,Collectors.counting()));

        //System.out.println(group);

        System.out.println(result);


    }
}
