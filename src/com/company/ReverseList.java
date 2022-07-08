package com.company;

import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        ListNode p = head;
        Scanner input = new Scanner(System.in);
        /**
         * 测试链表的创建
         * @author qiaoweibo
         * @date 2022/7/7 11:39 AM
         */
        int n = input.nextInt();
        for (int i = 0; i < n; ++i) {
            int c = input.nextInt();
            p.next = new ListNode(c);
            p = p.next;
        }
        p = head.next;
        /**
         * 测试链表的输出
         * @author qiaoweibo
         * @date 2022/7/7 11:39 AM
         */
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();

        /**
         * 测试反转链表
         * @author qiaoweibo
         * @date 2022/7/7 11:40 AM
         */
        p = head.next;
        p = reverseList(p);
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
        System.out.println("---------------------------------");

        /**
         * 创建结构体的另一种方式：ListNode(int val, ListNode next)//这种方式是从后向前生成链表（倒着来）
         * @author qiaoweibo
         * @date 2022/7/7 11:48 AM
         */
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2, node);
        ListNode node3 = new ListNode(3, node2);

        p = node3;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }  //这种创建方式不熟
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
