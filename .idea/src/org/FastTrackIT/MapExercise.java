package org.FastTrackIT;

import java.util.HashMap;
import java.util.Map;

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

        if(nameToAge.containsKey("Mark")){
            nameToAge.put("Mark",33);
        }
        nameToAge.putIfAbsent("Mark", 33);
        System.out.println(nameToAge);
    }


}
