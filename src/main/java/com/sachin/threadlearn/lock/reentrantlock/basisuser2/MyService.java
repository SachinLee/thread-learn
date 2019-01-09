package com.sachin.threadlearn.lock.reentrantlock.basisuser2;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sachin
 * @create 2018-12-27 20:07
 */
@Slf4j
public class MyService {

    private Lock lock = new ReentrantLock();

    public void testMethodA() {
        try {
            lock.lock();
            log.info("methodA begin, 当前线程:{}, 当前时间:{}", Thread.currentThread().getName(), LocalDateTime.now());
            TimeUnit.SECONDS.sleep(5);
            log.info("methodA end, 当前线程:{}, 当前时间:{}", Thread.currentThread().getName(), LocalDateTime.now());
        } catch (Exception e) {
            log.error("发生异常:{}", e.getMessage(), e);
        } finally {
            lock.unlock();
        }
    }

    public void testMethodB() {
        try {
            lock.lock();
            log.info("methodB begin, 当前线程:{}, 当前时间:{}", Thread.currentThread().getName(), LocalDateTime.now());
            TimeUnit.SECONDS.sleep(5);
            log.info("methodB end, 当前线程:{}, 当前时间:{}", Thread.currentThread().getName(), LocalDateTime.now());
        } catch (Exception e) {
            log.error("发生异常:{}", e.getMessage(), e);
        } finally {
            lock.unlock();
        }
    }

}
