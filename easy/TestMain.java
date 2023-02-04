package easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author SagamiYun
 * @version 2023/2/2
 * <p>@ClassName TestMain<p/>
 * <p>@Date 2023/2/2 5:18<p/>
 */
public class TestMain {
    public static void main(String[] args) {
        // 左字符串颠倒
        // System.out.println(leftRe());

        // 两数之和
        // System.out.println(Arrays.toString(twoNumSun()));

        // 回文数
        // System.out.println(testPalindrome());

        // 罗马数字转数字
        // System.out.println(testRomanToInt());

        // 最长公共前缀
        // System.out.println(testLongestCommonPrefix());

        // 判断有效的括号
        // System.out.println(testIsValid());

        // 合并两个链表为有序链表
        // System.out.println(testMergeTwoLists());

        // 删除有序数组中的重复项
        System.out.println(testRemoveDuplicates());
    }

    private static String leftRe(){
        String s = "lrloseumgh";
        int k = 6;
        return LeftReverse.leftRotate(s, k);
    }

    private static int[] twoNumSun() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        return twoSum.twoSum(nums, target);
    }

    private static boolean testPalindrome() {
        int num = 1222231;
        return Palindrome.isPalindrome(num);
    }

    private static int testRomanToInt() {
        RomanToInt romanToInt = new RomanToInt();
        String s = "MCMXCIV";
        return romanToInt.romanToInt(s);
    }

    private static String testLongestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        return longestCommonPrefix.longestCommonPrefix(strs);
    }

    private static boolean testIsValid() {
        String s = "()[]{}";
        return IsValid.isValid(s);
    }

    private static ArrayList<Integer> testMergeTwoLists() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode nodeList2 = new ListNode(4);
        ListNode nodeList1 = new ListNode(2, nodeList2);
        ListNode nodeList = new ListNode(1, nodeList1);
        ListNode secNodeList2 = new ListNode(4);
        ListNode secNodeList1 = new ListNode(3, secNodeList2);
        ListNode secNodeList = new ListNode(1, secNodeList1);
        ListNode listNode = mergeTwoLists.mergeTwoLists(nodeList, secNodeList);

        ArrayList<Integer> listNodes = new ArrayList<>();
        while (true) {
            listNodes.add(listNode.val);
            if (listNode.next == null) {
                break;
            }
            listNode = listNode.next;
        }

        return listNodes;
    }

    private static int testRemoveDuplicates() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        return removeDuplicates.removeDuplicates(nums);
    }
}
