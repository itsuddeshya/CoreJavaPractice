package FileHandling;

import java.io.FileWriter;
import java.io.*;

public class FileWriterMain {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\uddes\\OneDrive\\Desktop\\JavaFile\\file1.txt",true);
        fw.write(5);
        fw.write("\n");
        fw.write('R');
        fw.write("\n");
        fw.write("Uddeshya");
        fw.write("\n"); //To next line as File write classs not do this automatically
        char []ch={'a','b','c'};
        fw.write(ch);
        fw.write("\n");
        fw.flush();             //To give the guarantee the total data include last character also written to the file.
        fw.close();             //To close the stream.
    }



}
