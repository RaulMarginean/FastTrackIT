package org.fasttrackit.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class ObjectsFromFile {
    public static void main(String[] args) throws IOException {
        List<Person>personList = readPersons("file/perosns.data");
        System.out.println(" ");
    }

    public static List<Person> readPersons(String filePath) throws IOException {
        List<Person> result = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = bufferedReader.readLine()) != null) {

        }
    }
    private static Person personFromLine(String line){
        String[] tokens = line.split(Pattern.quote("|"));
        return new Person(tokens[0],Integer.parseInt(tokens[1],tokens[2]));
    }
}
