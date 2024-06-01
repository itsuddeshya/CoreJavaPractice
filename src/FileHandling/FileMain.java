package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileMain {
    public static void main(String[] args) throws IOException {
//        File file = new File("file1.txt ");       //To make file in current folder(src).
 //       File file = new File("C:\\Users\\uddes\\OneDrive\\Desktop\\JavaFile\\file1.txt"); //To create file on sys path
 //       file.createNewFile();
 //       File file = new File("C:\\Users\\uddes\\OneDrive\\Desktop\\JavaFile\\FileFolder");  //create diretory
        File file = new File("C:\\Users\\uddes\\OneDrive\\Desktop\\JavaFile\\FileFolder1");
        file.mkdir();
//        File file1 =new File("C:\\Users\\uddes\\OneDrive\\Desktop\\JavaFile\\FileFolder1\\file2.txt");
//        file1.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());


    }
}
