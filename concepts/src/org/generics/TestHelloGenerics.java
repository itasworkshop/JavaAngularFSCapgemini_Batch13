package org.generics;

//generic --> provide type safety features to our existing classes
//type safety --> printMe()
//

//whichever type you supply during object creation i will accept that
class MyClass<T>{

    T obj; //i don't know if my member will be string or int or something else

    MyClass(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    }

}

public class TestHelloGenerics {

    public static void main(String[] args){
        MyClass<String> myClass = new MyClass<>("Rajesh");

        System.out.println(myClass.getObj());
    }
}
