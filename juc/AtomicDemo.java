package com.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

class MyNumber {
    AtomicInteger number = new AtomicInteger();

}

public class AtomicDemo {

    public static void main(String[] args) throws InterruptedException {
        final int SIZE = 50;
        MyNumber myNumber = new MyNumber();
        CountDownLatch countDownLatch = new CountDownLatch(SIZE);

        for (int i = 0; i < SIZE; i++) {
                new Thread(() -> {

                    try {
                        myNumber.number.getAndIncrement();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    } finally {
                        countDownLatch.countDown();
                    }
                }).start();
        }

        countDownLatch.await();

        System.out.println(myNumber.number.get());
    }
}
