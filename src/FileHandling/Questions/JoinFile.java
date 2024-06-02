/*We have two files file2.txt and file2.txt merge the data of both files into another new file3.txt*/

package FileHandling.Questions;

import java.io.*;
public class JoinFile {
    public static void main(String[] args) throws IOException {

        PrintWriter pr = new PrintWriter("file3.txt");
        BufferedReader bf1=new BufferedReader(new FileReader("file1.txt"));
        String line1 = bf1.readLine();
        while (line1!=null){
            pr.println(line1);
            line1= bf1.readLine();
        }
        BufferedReader bf2=new BufferedReader(new FileReader("file2.txt"));
        String line2 = bf2.readLine();  
        while(line2!=null){
            pr.println(line2);
            line2=bf2.readLine();
        }

        pr.flush();
        bf1.close();
        bf2.close();
        pr.close();
    }
}
