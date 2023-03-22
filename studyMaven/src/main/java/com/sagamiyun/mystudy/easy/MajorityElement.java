package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/12
 * <p>@ClassName MajorityElement</p>
 * <p>@Description 摩尔投票法：
 * 这个方法利用了多数元素出现的次数比其他元素出现次数之和还要多的特点。
 * 摩尔投票法的基本思想是抵消不同的元素，直到找到一个出现次数超过半数的元素。
 * 具体地，遍历数组，对于每个元素，如果计数器为0，则将候选元素设置为当前元素；
 * 如果当前元素等于候选元素，则计数器加1，否则计数器减1。遍历结束后，候选元素就是多数元素。
 * 由于题目中保证给定的数组总是存在多数元素，因此这个方法是正确的，并且时间复杂度为O(n)，空间复杂度为O(1)。
 * </p>
 * <p>169. 多数元素</p>
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
