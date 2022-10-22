package org.FastTrackIT;

import java.io.*;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        redingFirstLine();
        readingAllFile();
        readFileBuffer();
    }

    private static void readFileBuffer() throws IOException {
        System.out.println("Buffered Read");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("File/content.txt"));
        String Line;
        while((Line = bufferedReader.readLine())!=null){
            System.out.println(Line);

        }
    }
private static void  readingAllFile() throws FileNotFoundException {
    System.out.println("Starting to read all files");
    Scanner scanner = new Scanner(new File("File", "content.txt"));
    while (scanner.hasNext()){
        System.out.println(scanner.nextLine());
    }
}
    private static void redingFirstLine() throws FileNotFoundException {

            Scanner scanner = new Scanner(new File("File", "content.txt"));
            String s = scanner.next();
            int i = scanner.nextInt();
            System.out.println(s);
            System.out.println(i);
        }
    }

