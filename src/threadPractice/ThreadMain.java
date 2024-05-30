package threadPractice;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
       System.out.println("Hi");
//       MyThread1 myThread1=new MyThread1();
//       MyThread2 myThread2=new MyThread2(); //Calling Thread1
//       myThread1.setPriority(10);
//       myThread2.setPriority(3);             //To set thread priority
//       myThread1.start();                    //t.start() creates new thread and execute code parallel to main thread of run method.Multi threading.
//       myThread1.run();                  //t.run() does not create any new thread it run code using main thread only.No multi threading
//       myThread2.start();
        Threads myThread1=new Threads();
        myThread1.start();
//        myThread1.join();   //Main thread waits untill complitition of Thread1.
        Threads.mainThread=Thread.currentThread();
        for(int i =0;i<20;i++){
//            if(i==5){myThread1.interrupt();}
            System.out.println("MainThread ="+i);
        }
        }
    }