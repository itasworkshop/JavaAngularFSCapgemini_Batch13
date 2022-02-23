package org.objectMethod;

class User{

    private int ssn;

    public User(int ssn) {
        this.ssn = ssn;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "ssn=" + ssn +
                '}';
    }
}

public class TestObjectMethods {
    public static void main(String[] args){
        User user = new User(25);
        System.out.println(user);
    }
}
