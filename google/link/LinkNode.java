package com.google.link;

import java.util.Stack;

public class LinkNode {
    public int val;
    public LinkNode next;
    public LinkNode(int x) { val = x; }
    public LinkNode(int x, LinkNode next) { val = x; this.next = next; }

    public void printList(LinkNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

// ======================================
// 反转链表

    public  LinkNode reverseList1(LinkNode oldHead) {
        // 遍历原链表，每次新建一个节点，并把它插到新链表的最前面。
        LinkNode newHead = null;
        LinkNode p = oldHead;
        while (p != null) {
            newHead = new LinkNode(p.val, newHead);
            p = p.next;
        }
        return newHead;
    }

    public void reverseList2(LinkNode oldHead) {
        if (oldHead.next == null || oldHead.next.next == null) {
            return;
        }
        // 带头节点
        LinkNode cur = oldHead.next;
        LinkNode next = null;
        LinkNode newHead = new LinkNode(0, null);
        while (cur != null) {
            next = cur.next; // 暂存cur下一个节点
            cur.next = newHead.next; // 将cur下一个节点指向新的节点
            newHead.next = cur; // 头节点指向cur
            cur = next; // cur后移
        }
        oldHead.next = newHead.next;
    }

    // 逆序打印单链表的每个节点 用栈这个数据结构
    public void reversePrint(LinkNode head) {
        if (head.next == null) {
            return;
        }
        Stack<LinkNode> stack = new Stack<>();
        LinkNode cur = head.next;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().val + " ");
        }
    }
}
