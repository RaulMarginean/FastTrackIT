package org.FastTrackIT.Maps;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("John", 20);
        nameToAge.put("Mark", 23);
        nameToAge.put("Angela", 19);
        nameToAge.put("Martha", 50);
        nameToAge.put("John", 40);


        System.out.println(nameToAge);
        System.out.println(nameToAge.keySet());

        if (!nameToAge.containsKey("Mark")) {
            nameToAge.put("Mark", 33);
        }
        nameToAge.putIfAbsent("Mark", 33);
        System.out.println(nameToAge);

        System.out.println(nameToAge.get("Angela"));

        if (nameToAge.containsValue(40)) {
            System.out.println("We have 40 years old person");
        } else {
            System.out.println("no 40 years old person was found");
        }
        nameToAge.remove("Martha");
        System.out.println(nameToAge);

        Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(String.format("%s has %d years.", entry.getKey(), entry.getValue()));
        }
        Map<String,List<Integer>> grades = new HashMap<>();
        if(grades.containsKey("Alex")){
            grades.put("Alex", new ArrayList<>());
        }
        grades.get("Alex").add(10);
        grades.get("Alex").add(7);
        System.out.println(grades);

    }
}
