package FileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderMain {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file1.txt");
//        int i =fr.read();       //read next character,if next char not availabe then return -1.
//        while (i!=-1){
//            System.out.print((char)i);
//            i = fr.read();
//        }
        char [] ch=new char[10];
        System.out.println(fr.read(ch));
        System.out.println(Arrays.toString(ch));


    }
}
