package com.juc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

class BankAccount {

    public volatile int money = 0;

    AtomicIntegerFieldUpdater<BankAccount> updater =
            AtomicIntegerFieldUpdater.newUpdater(BankAccount.class,"money");



}
public class AtuoFieldUpdaterDemo {

    public static void main(String[] args) {

    }
}
