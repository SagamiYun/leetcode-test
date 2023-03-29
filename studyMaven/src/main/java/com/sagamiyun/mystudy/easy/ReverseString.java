package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/29
 * <p>@ClassName ReverseString</p>
 * <p>@Description 我们定义了一个reverseString方法，该方法接受一个字符数组s作为输入。我们使用两个指针left和right，
 * 分别指向数组的第一个元素和最后一个元素。然后，我们使用一个循环，只要left小于right，就交换这两个位置的字符，
 * 并将left向右移动一位，将right向左移动一位。当left和right相遇时，循环结束，此时数组已经被反转。
 * 注意，这个实现满足题目要求的原地修改输入数组和使用O(1)额外空间的条件。 </p>
 * <p>344. 反转字符串</p>
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // 交换左右两侧的字符
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // 移动指针
            left++;
            right--;
        }
    }
}
