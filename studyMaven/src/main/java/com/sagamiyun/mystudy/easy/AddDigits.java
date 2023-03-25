package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/25
 * <p>@ClassName AddDigits</p>
 * <p>@Description TODO </p>
 * <p>258. 各位相加</p>
 */
public class AddDigits {

    public int addDigits(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
