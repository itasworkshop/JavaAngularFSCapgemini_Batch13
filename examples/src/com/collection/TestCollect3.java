package com.collection;

import java.util.*;

class User2{

    private int id;
    private String name;

    public User2(int id, String name) {
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
        if ((o instanceof User2) && (((User2) o).getId() == this.getId())) {
            return true;
        } else {
            return false;
        }
    }

    //hashCode --> to get better performance while searching your object
    public int hashCode() {
        return this.getId()*5;
    }
}

public class TestCollect3 {

    public static void main(String[] args){
        User2 user1 = new User2(101,"Rajesh");
        User2 user2 = new User2(102,"Raj");
        User2 user3 = new User2(103,"Suraj");
        User2 user4 = new User2(103,"Tom");

        //Set --> unique items
        //normal set without duplicates
        HashSet<User2> myset = new HashSet<User2>();

        //LinkedHashSet --> ordered set
        LinkedHashSet<User2> myset1 = new LinkedHashSet<>();

        //TreeSet -->

        myset.add(user1);
        myset.add(user2);
        myset.add(user3);
        myset.add(user4);

        System.out.println(myset);

        myset1.add(user1);
        myset1.add(user2);
        myset1.add(user3);
        myset1.add(user4);

        System.out.println(myset1);

    }
}
