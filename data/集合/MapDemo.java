package com.data.集合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MapDemo {

    public static void main(String[] args) {


        // 1.准备数据
        ArrayList<String> list = new ArrayList<>();

        String[] location = {"北京", "上海", "广州", "深圳", "杭州"};
        Random random = new Random();

        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(location.length);
            list.add(location[index]);
        }

        //
        HashMap<String, Integer> MapUse = new HashMap<>();

        for (String s : list) {

            MapUse.put(s,MapUse.containsKey(s) ? MapUse.get(s) + 1 : 1);
        }

        MapUse.forEach((k,v)-> {
            System.out.println("k = " + k + ", v = " + v);
        });

    }
}
