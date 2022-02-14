package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

class User1 extends Object{

    private int id;
    private String name;

    public User1(int id, String name) {
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
        if ((o instanceof User) && (((User) o).getId() == this.getId())) {
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

public class TestCollect2 {

    public static void main(String[] args){
        User1 user1 = new User1(101,"Rajesh");
        User1 user2 = new User1(102,"Raj");
        User1 user3 = new User1(103,"Suraj");
        User1 user4 = new User1(104,"Tom");

        //List --> 1. ArrayList<>
        //faster iteration
        ArrayList<User1> mylist = new ArrayList<User1>();

        //faster insertion and delteion
        LinkedList<User1> mylist1 = new LinkedList<User1>();

        //Thread safty methods in vector
        Vector<User1> mylist2 = new Vector<>();
        mylist2.add(user1);

        mylist1.add(user1);
        mylist1.add(user2);
        mylist1.add(user3);
        mylist1.add(user4);

        System.out.println(mylist1);

    }
}
