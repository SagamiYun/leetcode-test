package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/28
 * <p>@ClassName IsPowerOfFour</p>
 * <p>@Description 如果n小于等于0，返回false。
 * 如果n能被4整除，就让n除以4。
 * 重复步骤2，直到n不能被4整除为止。
 * 如果最终n等于1，说明n是4的幂次方；否则不是。 </p>
 * <p>342. 4的幂</p>
 */
public class IsPowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }
}
