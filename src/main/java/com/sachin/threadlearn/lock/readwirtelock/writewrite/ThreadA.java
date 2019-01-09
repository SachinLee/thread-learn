package com.sachin.threadlearn.lock.readwirtelock.writewrite;

/**
 * @author sachin
 * @create 2019-01-03 19:43
 */
public class ThreadA implements Runnable {

    private MyService service;


    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
