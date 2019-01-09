package com.sachin.threadlearn.lock.readwirtelock.readread;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author sachin
 * @create 2019-01-03 19:37
 */
@Slf4j
public class MyService {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            lock.readLock().lock();
            log.info("获得读锁：{}", LocalDateTime.now());
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            log.error("sleep 发生异常，{}", e.getMessage(), e);
        } finally {
            lock.readLock().unlock();
        }
    }
}
