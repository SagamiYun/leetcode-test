package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName ReverseList</p>
 * <p>@Description 这个方法使用三个指针（prev，current和next）遍历链表并逐个反转节点的指向。 </p>
 * <p>206. 反转链表</p>
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
