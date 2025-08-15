package com.juc;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureAPI {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        FutureTask<String> futureTask = new FutureTask<String>(() -> {
            System.out.println("执行任务");
            TimeUnit.SECONDS.sleep(3);
            return "hello";
        });

        Thread t1 = new Thread(futureTask, "t1");
        t1.start();

//        String s = futureTask.get(); // .get写在程序的最后面 但是最后还是没得到结果
//        String s2 = futureTask.get(1, TimeUnit.SECONDS); // 就等1s 过时不侯


    }
}
