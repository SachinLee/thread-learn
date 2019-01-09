package com.sachin.threadlearn.lock.reentrantlock.conditions;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sachin
 * @create 2019-01-01 20:18
 */
@Slf4j
public class MyService {

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            log.info("await时间:{}", LocalDateTime.now());
            condition.await();
        } catch (InterruptedException e) {
            log.error("condition await发生异常：{}", e.getMessage(), e);
        } finally {
            lock.unlock();
        }
    }

    public void signal() {
        try {
            lock.lock();
            log.info("signal 时间为:{}", LocalDateTime.now());
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
