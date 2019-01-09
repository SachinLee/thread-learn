package com.sachin.threadlearn.lock.readwirtelock.readwrite;

/**
 * @author sachin
 * @create 2019-01-03 19:43
 */
public class ThreadB implements Runnable {

    private MyService service;


    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
