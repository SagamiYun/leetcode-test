package easy;

/**
 * @author SagamiYun
 * @version 2023/3/11
 * <p>@ClassName HasCycle</p>
 * <p>@Description 定义快指针和慢指针，初始时都指向链表的头节点。
 * 通过快指针和慢指针不断地遍历链表，如果快指针指向的节点为 null，说明链表中不存在环，返回 false。
 * 如果快指针和慢指针相遇，说明链表中存在环，返回 true。 </p>
 * <p>141. 环形链表</p>
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
