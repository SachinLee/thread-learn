package com.sachin.threadlearn.lock.readwirtelock.writewrite;

/**
 * @author sachin
 * @create 2019-01-03 19:50
 */
public class Main {

    public static void main(String[] args) {
        MyService service = new MyService();
        Thread thread = new Thread(new ThreadA(service));
        thread.start();
        Thread thread1 = new Thread(new ThreadA(service));
        thread1.start();
    }
}
