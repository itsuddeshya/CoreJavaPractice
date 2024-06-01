package Serialization;

import java.io.*;

public class SerializationMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student();
        student.setMarks(84);
        student.setName("Raj");
        student.setRollNo(51);
            /*for serialization of student class*/
        FileOutputStream fileOutputStream=new FileOutputStream("SerFile.txt");   //to represent file
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream); //for ser
        objectOutputStream.writeObject(student);
        objectOutputStream.close();

        /*for Deserialization of student class*/

        FileInputStream fileInputStream=new FileInputStream("SerFile.txt");
        ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
        Student student1=(Student)objectInputStream.readObject();
        System.out.println(student1);
    }

}
