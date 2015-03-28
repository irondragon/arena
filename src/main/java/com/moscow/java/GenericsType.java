package com.moscow.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by messi on 29.01.2015.
 */

public class GenericsType<T> {

    private T t;

    public T get(){
        return this.t;
    }

    public void set(T t1){
        this.t=t1;
    }

    public static <U extends Comparable<U>> int compare(U t1, U t2){
        return t1.compareTo(t2);
    }

    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("Pankaj"); //valid

        GenericsType type1 = new GenericsType(); //raw type
        type1.set("Pankaj"); //valid
        type1.set(10); //valid and autoboxing support
        Core core = new Core();
        GenericsType<Core> coreGenericsType1 = new GenericsType<Core>();
        GenericsType<Core> coreGenericsType2 = new GenericsType<Core>();
        GenericsType.<Core>compare(new Core(), new Core());
        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number> numList = intList;
        int t=0;
        ++t;
    }
}