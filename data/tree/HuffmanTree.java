package com.data.tree;

import java.util.PriorityQueue;

class HuffmanNode implements Comparable<HuffmanNode>{
        int value;
        HuffmanNode left;
        HuffmanNode right;

        public HuffmanNode(int value) {
            this.value = value;
            left = null;
            right = null;
        }

         @Override
         public int compareTo(HuffmanNode o) {
             return this.value - o.value;
         }
     }

public class HuffmanTree {

         public static HuffmanNode createHuffmanTree(int[] arr) {

             if (arr == null || arr.length == 0) {
                 return null;
             }

             // sort the array to use priority queue
             PriorityQueue<HuffmanNode> queue = new PriorityQueue<>();
             for (int i = 0; i < arr.length; i++) {
                 queue.add(new HuffmanNode(arr[i]));
             }

             while (queue.size() > 1) {
                 HuffmanNode left = queue.poll();
                 HuffmanNode right = queue.poll();
                 HuffmanNode parent = new HuffmanNode(left.value + right.value);
                 parent.left = left;
                 parent.right = right;
                 queue.add(parent);
             }

             return queue.poll();
         }

}
