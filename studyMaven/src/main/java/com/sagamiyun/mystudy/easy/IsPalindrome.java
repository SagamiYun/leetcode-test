package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/6
 * <p>@ClassName IsPalindrome</p>
 * <p>@Description
 * 1、这里使用了Java字符串的toLowerCase()方法将所有大写字符转换为小写字符，
 * 并使用replaceAll()方法移除所有非字母数字字符。然后使用双指针法从字符串两端开始比较字符是否相同，
 * 如果存在不相同的字符则返回false，否则返回true。
 * 2、这段代码首先检查链表是否为空或仅包含一个元素，如果是，则返回 true，因为这样的链表肯定是回文链表。
 * 然后，我们使用快慢指针找到链表的中点。接下来，我们反转链表的后半部分，将其与前半部分进行比较。
 * 如果它们相同，那么这个链表就是回文链表。最后，返回结果。
 * </p>
 * <p>125. 验证回文串</p>
 */
public class IsPalindrome {

    /**
     *  验证字符回文串
     */
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        s = s.toLowerCase().replaceAll("[^a-zA-Z\\d]", "");
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /**
     *  验证链表回文串
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while (slow != null) {
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = prev;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
}
