package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/12
 * <p>@ClassName GetIntersectionNode</p>
 * <p>@Description 这个方法的基本思想是，分别从链表A和链表B的头节点出发，同时遍历这两个链表，直到找到相交的节点或者遍历完链表为止。
 * 具体地，设置两个指针pA和pB分别指向链表A和链表B的头节点。然后，让pA遍历链表A，让pB遍历链表B，每次让指针向后移动一个节点，
 * 直到pA和pB相等，即找到了相交节点，或者pA和pB都遍历完了链表，这时返回null。
 * 在遍历过程中，由于两个链表可能长度不相等，因此如果pA或pB遍历完了链表，则将它们指向另一个链表的头节点继续遍历。
 * 由于两个指针都遍历了链表A和链表B的所有节点，而且两个指针在相交节点之前都走过了相同的距离，因此它们最终会在相交节点相遇。
 * 由于这个方法只遍历了两个链表一次，因此时间复杂度是O(m+n)，其中m和n分别是链表A和链表B的长度。由于这个方法只使用了常数级别的额外空间，因此空间复杂度是O(1)。 </p>
 * <p>160. 相交链表</p>
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = (pA != null) ? pA.next : headB;
            pB = (pB != null) ? pB.next : headA;
        }
        return pA;
    }
}
