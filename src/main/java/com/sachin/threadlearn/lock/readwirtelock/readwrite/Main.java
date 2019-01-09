package com.sachin.threadlearn.lock.readwirtelock.readwrite;

import java.util.concurrent.TimeUnit;

/**
 * @author sachin
 * @create 2019-01-03 19:50
 */
public class Main {

    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        Thread thread = new Thread(new ThreadB(service));
        thread.start();

        TimeUnit.SECONDS.sleep(10);

        Thread thread1 = new Thread(new ThreadA(service));
        thread1.start();
    }
}
