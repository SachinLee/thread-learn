package com.sachin.threadlearn.lock.reentrantlock.conditions;

import sun.java2d.loops.GraphicsPrimitive;

import java.util.concurrent.TimeUnit;

/**
 * @author sachin
 * @create 2019-01-01 20:26
 */
public class Main {

    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        ThreadA threadA = new ThreadA(service);
        Thread thread = new Thread(threadA);
        thread.start();
        TimeUnit.SECONDS.sleep(5);
        service.signal();
    }

}
