package com.collection;

import java.util.*;

class User3{

    private int id;
    private String name;

    public User3(int id, String name) {
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
}

public class TestCollect4 {

    public static void main(String[] args){
        User3 user1 = new User3(101,"Rajesh");
        User3 user2 = new User3(102,"Raj");
        User3 user3 = new User3(103,"Suraj");
        User3 user4 = new User3(103,"Tom");

        //Map --> key-value pair
        HashMap<Integer, User3> mymap = new HashMap<>();

        //LinkedHashMap --> cares about ordering
        LinkedHashMap<Integer,User3> mymap1 = new LinkedHashMap<>();

        //Treemap --> soreted
        TreeMap<Integer,User3> mymap2 = new TreeMap<>();

        mymap.put(555,user1);
        mymap.put(666,user1);
        mymap.put(777,user1);
        mymap.put(888,user1);
        //mymap.put(555,user1); key should be unquie

        mymap1.put(555,user1);
        mymap1.put(666,user1);
        mymap1.put(777,user1);
        mymap1.put(888,user1);

        System.out.println(mymap);
        System.out.println(mymap1);

    }
}
