package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/25
 * <p>@ClassName UglyNumber</p>
 * <p>@Description 首先检查n是否小于等于0，如果是，则返回false。
 * 然后定义一个包含质因数2、3、5的数组primeFactors。对于数组中的每个质因数，
 * 使用while循环不断地将n除以该质因数，直到n不能被该质因数整除。 </p>
 * <p>263. 丑数</p>
 */
public class UglyNumber {
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] primeFactors = {2, 3, 5};
        for (int factor : primeFactors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
