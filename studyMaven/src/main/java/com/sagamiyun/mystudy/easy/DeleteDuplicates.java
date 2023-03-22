package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/2/17
 * <p>@ClassName DeleteDuplicates</p>
 * <p>@Description 该算法通过维护一个指针current，遍历链表并比较相邻元素的值，
 * 如果相等则删除后一个元素，否则继续遍历。
 * 时间复杂度为$O(n)$，空间复杂度为$O(1)$。 </p>
 * <p>83. 删除排序链表中的重复元素</p>
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
