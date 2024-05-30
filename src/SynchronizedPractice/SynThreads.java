package SynchronizedPractice;

class SynThread1 extends Thread {
    private Student student;
    SynThread1(Student student){
        this.student=student;
    }
    public void run(){
        student.display("from Thread1");
        //System.out.println("Thread1 ended "+Student.count);
    }
}
class SynThread2 extends Thread {
    private Student student;
    SynThread2(Student student){
        this.student=student;
    }
    public void run(){
        student.display("from Thread2");
       // System.out.println("Thread2 ended "+Student.count);
    }
}
