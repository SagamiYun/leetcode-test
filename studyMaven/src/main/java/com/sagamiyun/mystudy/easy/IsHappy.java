package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName IsHappy</p>
 * <p>@Description 这个算法会不断将整数替换为其各个位置上的数字的平方和，
 * 直到该数变为1或出现循环。若该数变为1，则它是快乐数，否则不是。 </p>
 * <p>202. 快乐数</p>
 */

public class IsHappy {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }

    private static int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
