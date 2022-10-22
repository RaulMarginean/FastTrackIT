package org.FastTrackIT;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ObjectsFromFile {
    public static void main(String[] args) throws IOException {
        List<Person> personList = readPersons("File/Persons.data");
        writeReport(personList);
    }
private static void writeReport(List<Person>personList) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("File/report.data"));
        for (Person person:personList){
            writer.write(pesonToLine(person));
            writer.newLine();
        }
        writer.close();
}

    public static List<Person>readPersons(String filepath) throws IOException {
        List<Person> result = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
        String line;
        while((line = bufferedReader.readLine())!=null){
          result.add(personFromLine(line));
        }
        return result;
    }
    private static String pesonToLine(Person person){
        return String.format("%s is the name, %d is the age with position %s", person.name(), person.age(), person.position());

    }
    private static Person personFromLine(String line){
        String[] tokens = line.split(Pattern.quote("|"));
        return new Person(tokens[0], Integer.parseInt(tokens[1]),tokens[2]);

    }
}
