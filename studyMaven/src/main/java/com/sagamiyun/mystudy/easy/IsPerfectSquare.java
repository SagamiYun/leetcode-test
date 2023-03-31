package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/30
 * <p>@ClassName IsPerfectSquare</p>
 * <p>@Description 使用二分查找来解决这个问题，每次将给定数 num 的范围缩小一半，
 * 直到找到一个能够整除的平方数或者整个区间缩小至 1。 </p>
 * <p>367. 有效的完全平方数</p>
 */
public class IsPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num <= 1) {
            return true;
        }

        long left = 1, right = num / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}
