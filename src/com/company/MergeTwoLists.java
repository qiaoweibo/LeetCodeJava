package com.company;

/**
 * @author QiaoWeiBo
 * @date 2022/7/14 12:07 AM
 */
public class MergeTwoLists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }  //这种创建方式不熟
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pre = new ListNode(-1);
        ListNode p = pre;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        p.next = list1 == null ? list2 : list1;
        return pre.next;
    }
}
