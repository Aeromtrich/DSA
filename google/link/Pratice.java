package com.google.link;

public class Pratice {




    public static void main(String[] args) {

        LinkNode o4 = new LinkNode(4,null);
        LinkNode o3 = new LinkNode(3,o4);
        LinkNode o2 = new LinkNode(2,o3);
        LinkNode head = new LinkNode(0,o2);

//        head.reverseList2(head);
//        head.printList(head);

        head.reversePrint(head);
    }
}
