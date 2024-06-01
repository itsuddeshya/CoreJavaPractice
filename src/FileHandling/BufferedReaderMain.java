package FileHandling;

import java.io.*;

public class BufferedReaderMain {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("file1.txt"));//        int i =fr.read();       //read next character,if next char not availabe then return -1.
        String line =bufferedReader.readLine();
        System.out.println(line);       //To read single line
        /* To read multipes line*/
        while (line!=null){
            System.out.println(line);
            line=bufferedReader.readLine();
        }
       // bufferedReader.close();
    }
}
