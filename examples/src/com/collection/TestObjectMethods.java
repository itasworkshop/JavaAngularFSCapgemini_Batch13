package com.collection;

//Object --> parent of all the classess
//toString() from object --> string represntation of object
class User extends Object{

    private int id;
    private String name;

    public User(int id, String name) {
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

    /*
    public String toString() {
        return "hello";
    }*/

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
public class TestObjectMethods {

    public static void main(String[] args){
        User user1 = new User(101,"Rajesh");
        User user2 = new User(102,"Rajesh");

        System.out.println(user1.equals(user2));

        System.out.println(user1);
        System.out.println(user2);
    }
}
