package com.sachin.threadlearn.lock.reentrantlock.basisuser;

/**
 * @author sachin
 * @create 2018-12-27 19:47
 */
public class Main {

    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread thread = new MyThread(service);
        Thread thread1 = new Thread(thread, "a");
        Thread thread2 = new Thread(thread, "b");
        Thread thread3 = new Thread(thread, "c");
        Thread thread4 = new Thread(thread, "d");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
