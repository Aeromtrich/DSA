package com.data.集合;

import java.util.ArrayList;

public class collection {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ATCFG");
        arr.add("BAJKT");
        arr.add("CDGDF");

    /*
        Iterator<String> iterator = arr.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
 ===========================
        // 增强for循环 arr.for
        for (String s : arr) {
            System.out.println(s);
        }
    */

    /*    // 并发修改异常 索引倒退
        for (int i = 0; i < arr.size(); i++) {
            String name = arr.get(i);
            if (name.contains("ATC")) {
                arr.remove(name);
                i--;
            }
        }
        System.out.println(arr);


        // 倒着遍历
        for (int i = arr.size() - 1; i >= 0 ; i--) {
            String name = arr.get(i);
            if (name.contains("ATC")) {
                arr.remove(name);
            }
        }
    }

    */
    }
}
