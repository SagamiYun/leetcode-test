package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/2/4
 * <p>@ClassName MergeTwoLists</p>
 * <p>@Description 初始化一个哨兵节点 newNodeList ，并且使用 cur 指针指向 newNodeList ，来存储合并后的新链表。
 * 使用 while 循环，不断比较 l1 和 l2 的当前节点值，如果 l1 当前节点小于等于 l2 当前节点，
 * 则将 l1 当前节点的 next 指向合并后的新链表，并将 l1 指针后移一位；
 * 否则，将 l2 当前节点的 next 指向合并后的新链表，并将 l2 指针后移一位。
 * 如果其中一个链表已经遍历完成，那么将剩下的另一个链表直接拼接到合并后的新链表后面。
 * 返回 newNodeList.next ，也就是合并后的新链表。 </p>
 * <p>21. 合并两个有序链表</p>
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNodeList = new ListNode(0);
        ListNode cur = newNodeList;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        if (list1 == null) {
            cur.next = list2;
        } else {
            cur.next = list1;
        }

        return newNodeList.next;
    }
}
