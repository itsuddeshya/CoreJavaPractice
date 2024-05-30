package threadPractice;

class Threads extends Thread  {
    public static Thread mainThread;    //object of main thread

    public void run(){      //write code in run() which we want to execute using MyThread1 In parallel to main thread
        //MyThread2 myThread2= new MyThread2(); //we are starting Thread2 using our Thread1
        //myThread2.start();
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i =0;i<20;i++){

            System.out.println("Thread1 ="+i);
        }
    }
}
//class MyThread2 extends Thread{
//    public void run(){
//       // MyThread3 myThread3=new MyThread3();
//        //Thread thread3 =new Thread(myThread3,"th"); //Creating thread by implementing Runnable interface then we have to make object of Thread class as start() method is not present in Runnable class its in thread class.
//        //thread3.start();
//        for(int i =0;i<20;i++){
//            System.out.println("Thread2 ="+i);
//        }
//    }
//}
//class MyThread3 implements Runnable{
//
//    @Override
//    public void run() {
//        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//
//        for(int i =0;i<20;i++){
//
//            System.out.println("Thread3 ="+i+Thread.currentThread().getName());
//        }
//    }
//}
