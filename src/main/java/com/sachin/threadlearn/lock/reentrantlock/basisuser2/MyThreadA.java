package com.sachin.threadlearn.lock.reentrantlock.basisuser2;

/**
 * @author sachin
 * @create 2018-12-27 20:27
 */
public class MyThreadA implements Runnable {

    private MyService service;

    public MyThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethodA();
    }
}
