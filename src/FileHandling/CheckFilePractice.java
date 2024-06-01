    /*Check File of desktop*/

package FileHandling;
import java.io.File;

public class CheckFilePractice {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\uddes\\OneDrive\\Desktop");
        String [] fileNames = file.list();
        for (String name:fileNames){
            File file1 = new File("C:\\Users\\uddes\\OneDrive\\Desktop\\"+name);
            if(file1.isFile()){
                System.out.println("This is file :"+ file1.getName());
            }
            else {
                System.out.println("This is Directory :"+ file1.getName());
            }
        }
    }

}
