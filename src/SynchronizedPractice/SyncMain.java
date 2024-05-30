package SynchronizedPractice;

public class SyncMain {
    public static void main(String[] args) {
        Student student=new Student();
        SynThread1 synThread1=new SynThread1(student);
        SynThread2 synThread2=new SynThread2(student);
        synThread1.setName("SyncThread1");
        synThread2.setName("SyncThread2");
        synThread1.setPriority(8);  //Set priority of thread
        synThread1.start();
        synThread2.start();
    }
}
