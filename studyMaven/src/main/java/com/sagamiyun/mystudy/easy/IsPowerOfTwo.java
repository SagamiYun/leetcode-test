package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName IsPowerOfTwo</p>
 * <p>@Description 这种方法使用了位运算，检查给定整数n的二进制表示中是否只有一个比特位为1。 </p>
 * <p>231. 2 的幂</p>
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
