package org.FastTrackIt.Collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);
        set.add(0);
        set.add(3);
        set.add(123);
        set.add(234);

        System.out.println(set);

        /*SortedSet<Integer>sortedSet1 =new TreeSet<>();
        sortedSet1.add(1);
        sortedSet1.add(234);
        sortedSet1.add(1);
        sortedSet1.add(0);
        sortedSet1.add(3);
        sortedSet1.add(123);
        sortedSet1.add(2);
        System.out.println(sortedSet1);*/

        SortedSet<DescendingInteger> sortedSet = new TreeSet<>();
        sortedSet.add(new DescendingInteger(1));
        sortedSet.add(new DescendingInteger(234));
        sortedSet.add(new DescendingInteger(1));
        sortedSet.add(new DescendingInteger(0));
        sortedSet.add(new DescendingInteger(3));
        sortedSet.add(new DescendingInteger(123));
        sortedSet.add(new DescendingInteger(2));

        System.out.println(sortedSet);
    }
}

class DescendingInteger implements Comparable<DescendingInteger> {
    private Integer value;

    public DescendingInteger(Integer value) {
        this.value = value;
    }

    @Override
    public int compareTo(DescendingInteger o) {
        return -(value - o.value);
    }
}