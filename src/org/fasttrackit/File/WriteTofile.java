package org.fasttrackit.File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTofile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt",true));
        writer.write("This is my first output file" + System.lineSeparator());
        writer.newLine();
        writer.write("Thids is my second output file");
        writer.newLine();
        writer.close();
    }
}
