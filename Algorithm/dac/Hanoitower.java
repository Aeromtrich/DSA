package com.Algorithm.dac;

public class Hanoitower {

    public void hanoi(int n , String source , String auxiliary , String target) {
        if (n == 1) {
            System.out.println("把盘子1从" + source + "移动到" + target);
            return;
        }
        hanoi(n - 1, source, target, auxiliary);
        System.out.println("把盘子" + n + "从" + source + "移动到" + target);
        hanoi(n - 1, auxiliary, source, target);
    }

    public static void main(String[] args) {
        Hanoitower hanoitower = new Hanoitower();
        hanoitower.hanoi(3, "A柱", "B柱", "C柱");
    }
}
