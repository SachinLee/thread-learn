package com.sachin.threadlearn.lock.reentrantlock.basisuser;

/**
 * @author sachin
 * @create 2018-12-27 19:50
 */
public class MyThread implements Runnable {

    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
