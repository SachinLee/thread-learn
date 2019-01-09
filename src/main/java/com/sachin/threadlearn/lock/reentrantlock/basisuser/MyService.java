package com.sachin.threadlearn.lock.reentrantlock.basisuser;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sachin
 * @create 2018-12-27 19:42
 */
@Slf4j
public class MyService {

    private Lock lock = new ReentrantLock();

    /**
     * 模拟具体的执行逻辑
     */
    public void testMethod() {
        lock.lock();
        for (int i = 0; i < 5; i++) {
            log.info("当先线程名称:{}-循环次数{}", Thread.currentThread().getName() , (i+1));
        }

//        if ("b".equals(Thread.currentThread().getName())) {
//            int a = 1 / 0; // 模拟发生异常情况，不释放锁
//        }

        lock.unlock();
    }
}
