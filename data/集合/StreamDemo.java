package com.data.集合;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
//        HashMap<String, Integer> map = new HashMap<>();
//        Stream<String> stream1 = map.keySet().stream();
//        Stream<Integer> stream2 = map.values().stream();
        list.add("张三丰");
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");

        Stream<String> arr = stream.filter(s -> s.startsWith("张") && s.length() == 3);

        arr.forEach(System.out::println);

    }

}
