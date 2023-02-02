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
        System.out.println(testLongestCommonPrefix());
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
}
