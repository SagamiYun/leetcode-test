package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/13
 * <p>@ClassName ReverseBits</p>
 * <p>@Description 此方法通过将结果向左移一位，然后将n的最低位添加到结果中，
 * 然后将n向右移一位，以便处理下一位。重复32次后，结果将包含颠倒顺序的二进制位。 </p>
 * <p>190. 颠倒二进制位</p>
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        return result;
    }
}
