package org.java8new;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Filter<T>{
    boolean filter(T t);
}

class FilterHelper{

    public static <T> List<T> filter(List<T> input, Filter<T> filter){

        List<T> result = new ArrayList<T>();

        for (T t: input){
            if(filter.filter(t)){
                result.add(t);
            }
        }
        return result;
    }
}

public class TestFilterLambda {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(2,3,45,23,56,78,56,89,24);

        System.out.println(FilterHelper.filter(numbers,
                (Integer t) -> { return t%2==0; })
        );
    }
}
