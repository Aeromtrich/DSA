package com.juc;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

class ClickNumber {
    int number = 0;

    // 最原始 很重的锁
//    public synchronized void add() {
//        number++;
//    }
    // 稍微好一些
//    AtomicLong atomicLong = new AtomicLong(0);
//    public void add() {
//        atomicLong.getAndIncrement();
//    }

    // 更好 性能比atomicLong更好
    LongAdder longAdder = new LongAdder();
    public void add() {
        longAdder.increment();
    }

    // 另外的方式
    LongAccumulator longAccumulator = new LongAccumulator( (x , y) -> x + y, 0 );
    public void add2() {
        longAccumulator.accumulate(1);
    }

}
public class LongAdderDemo {

}
