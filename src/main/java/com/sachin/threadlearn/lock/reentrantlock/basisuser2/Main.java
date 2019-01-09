package com.sachin.threadlearn.lock.reentrantlock.basisuser2;

/**
 * @author sachin
 * @create 2018-12-27 20:29
 */
public class Main {

    public static void main(String[] args) {
        MyService service = new MyService();
        Thread t1 = new Thread(new MyThread(service));
        Thread t2 = new Thread(new MyThreadA(service));
        Thread t3 = new Thread(new MyThreadB(service));
        Thread t4 = new Thread(new MyThreadBB(service));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
