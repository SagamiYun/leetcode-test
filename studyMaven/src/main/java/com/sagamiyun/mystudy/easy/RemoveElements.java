package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName RemoveElements</p>
 * <p>@Description TODO </p>
 * <p>203. 移除链表元素</p>
 */
public class RemoveElements {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = head;
        ListNode prev = dummy;

        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }

        return dummy.next;
    }
}
