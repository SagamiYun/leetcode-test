package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/29
 * <p>@ClassName ReverseVowels</p>
 * <p>@Description 我们使用两个指针left和right分别指向数组的第一个元素和最后一个元素。然后，我们使用一个循环，
 * 只要left小于right，就寻找这两个位置的元音字符。如果找到两个元音字符，就交换它们，并将left向右移动一位，将right向左移动一位。
 * 我们还定义了一个辅助方法isVowel，用于判断一个字符是否为元音字母。在这个方法中，我们将输入的字符转换为小写，
 * 然后检查它是否等于'a'、'e'、'i'、'o'或'u'。 </p>
 * <p>345. 反转字符串中的元音字母</p>
 */
public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            while (left < right && !isVowel(arr[right])) {
                right--;
            }
            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
