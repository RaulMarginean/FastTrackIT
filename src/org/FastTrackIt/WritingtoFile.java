package org.FastTrackIt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingtoFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("File/output.txt", true));
        writer.write("This is my first Output file");
        writer.newLine();
        writer.write("This is my second output file");
        writer.newLine();
        writer.close();
    }

}
