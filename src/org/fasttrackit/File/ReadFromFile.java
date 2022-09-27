package org.fasttrackit.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        readingFistLine();
    }

    private static void readingFistLine() {
        try{
            Scanner scanner = new Scanner(new File("files","content.txt"));
            String s  = scanner.next();
            int i = scanner.nextInt();
            System.out.println(s);
            System.out.println(i);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
