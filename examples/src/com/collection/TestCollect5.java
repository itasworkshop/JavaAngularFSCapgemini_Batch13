package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

//comparable interface --> used for sorting logic
class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return this.getName();
    }


    //equals to tell how my two object are going to be considered eqal to each other or not
    public boolean equals(Object o) {
        if ((o instanceof User3) && (((User3) o).getId() == this.getId())) {
            return true;
        } else {
            return false;
        }
    }

    //hashCode --> to get better performance while searching your object
    public int hashCode() {
        return this.getId()*5;
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
}

public class TestCollect5 {

    public static void main(String[] args) {
        Person user1 = new Person(101, "Rajesh");
        Person user2 = new Person(102, "Saaj");
        Person user3 = new Person(103, "Tom");
        Person user4 = new Person(104, "John");

        ArrayList<Person> mylist = new ArrayList<>();
        mylist.add(user1);
        mylist.add(user2);
        mylist.add(user3);
        mylist.add(user4);

        System.out.println(mylist);
        //Collections.sort(mylist);

        System.out.println(mylist);

        //sorted set
        TreeSet<Person> myset = new TreeSet<>();
        myset.add(user1);
        myset.add(user2);
        myset.add(user3);
        myset.add(user4);

        System.out.println(myset);
    }

}
