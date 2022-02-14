package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

//Integer vs int
//int a =5; not an object
//Integer a = 5; object of value int 5
//

//collection of objects
public class TestCollect1 {

    public static void main(String[] args){
        //array vs arraylist
        //array --> size
        //arrayList is more powerful
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        mylist.add(5);
        mylist.add(10);
        mylist.add(15);

        //System.out.println(mylist.get(1));
        System.out.println(mylist);

        mylist.remove(2);

        System.out.println(mylist);

        //iteration --> going through each item one by one
        for (Integer i:mylist ) {
            System.out.println(i);
        }

        Iterator<Integer> itr= mylist.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
