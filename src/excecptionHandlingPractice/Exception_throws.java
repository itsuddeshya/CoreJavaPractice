package excecptionHandlingPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exception_throws {
    public static void main(String[] args) throws FileNotFoundException {
        f1();
        }
        public static void f1() throws FileNotFoundException {
        System.out.println("f1 called");
       // File file=new File("abc file");
            PrintWriter printWriter=new PrintWriter("abc");
            printWriter.println("1st line");
            printWriter.close();
    }
}
