package com.data.design;

public class A {
    // 2创建单例
    private static A instance = new A();

    // 1私有化构造方法
    private A() {

    }
    // 3提供公共的访问方法
    public static A getInstance() {
        return instance;
    }

}
