package com.main.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    static Character[] charArray= {'a','b','c'};

    /**
     *
     * @param array
     * @param <T> generic type that denotes the type of parameter passed during method call
     * @return List of generic type
     */
    private static <T> List<T> arrayToList(T[] array){
        List<T> list = new ArrayList<T>();
        for(T item : array){
            list.add(item);
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println(arrayToList(charArray).get(charArray.length-1));
    }
}
