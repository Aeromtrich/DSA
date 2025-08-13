package com.juc;

class phone {

    public synchronized void sendSMS() {
        System.out.println("sendSMS");
    }

}

public class Sychron {

    public static void main(String[] args) {
        phone phone = new phone();

        new Thread( () -> {
//            String name = Thread.currentThread().getName();
            phone.sendSMS();
        },"A").start();
    }
}
