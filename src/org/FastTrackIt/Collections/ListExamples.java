package org.FastTrackIt.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<Integer>integers = new ArrayList<>();

        List<Integer>linkedIntegers = new LinkedList<>();

        integers.add(1);
        integers.add(2);
        integers.add(1);
        integers.add(10);
        integers.add(3);
        System.out.println(integers);
    }
    public static void doSomething(List<String>list){

    }

}
