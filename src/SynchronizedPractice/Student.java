package SynchronizedPractice;

public class Student {

    public static int count=0;

    synchronized public void display(String message){

        for(int i =0;i<=20;i++){
//            if(Thread.currentThread().getName().equals("SyncThread1")){
//                count++;
//            }else{
//                count =count+2;
//            }
            System.out.println("Student "+message);
        }
    }
}

