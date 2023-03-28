package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/28
 * <p>@ClassName IsPowerOfThree</p>
 * <p>@Description 们首先检查给定的整数n是否为正数，因为负数和零不可能是3的幂次方。
 * 然后，我们使用一个循环，只要n能被3整除，就将其除以3。
 * 最后，如果n变为1，说明它是3的幂次方，返回true；否则，返回false。 </p>
 * <p>326. 3 的幂</p>
 */

public class IsPowerOfThree {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
