package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/13
 * <p>@ClassName HammingWeight</p>
 * <p>@Description 首先将输入的无符号整数与掩码 0x01 相与，判断最低位是否为 1，
 * 然后再将输入的无符号整数右移一位，继续与掩码相与，判断下一位是否为 1，
 * 以此类推，直到无符号整数为 0。 </p>
 * <p>191. 位1的个数</p>
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
}
