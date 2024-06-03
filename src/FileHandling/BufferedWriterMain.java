package FileHandling;

import java.io.*;

public class BufferedWriterMain {
    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file1.txt"));
        bufferedWriter.write(100);
        bufferedWriter.write("\n");
        bufferedWriter.write("Raj singh");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
