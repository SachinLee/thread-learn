package com.sachin.threadlearn.lock.reentrantlock.conditions;

/**
 * @author sachin
 * @create 2019-01-01 20:24
 */
public class ThreadA implements Runnable {

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
