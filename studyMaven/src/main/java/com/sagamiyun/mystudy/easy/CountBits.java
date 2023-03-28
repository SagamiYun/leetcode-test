package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/28
 * <p>@ClassName CountBits</p>
 * <p>@Description 我们使用一个循环，对于0 <= i <= n中的每个整数i，
 * 计算它的二进制表示中1的个数，并将结果存储在数组ans中。为了计算一个整数的二进制表示中1的个数，我们定义了一个辅助方法countOnes。
 * countOnes方法接受一个整数num作为输入，并使用一个循环遍历num的每个二进制位。在循环中，我们使用按位与操作num & 1检查最低位是否为1。
 * 如果最低位为1，我们将计数器count加1。然后，我们使用无符号右移操作num >>>= 1将num的二进制位向右移动一位。当num变为0时，循环结束。
 * 最后，countBits方法返回包含给定整数范围内每个数字的二进制表示中1的个数的数组ans。
 * </p>
 * <p>338. 比特位计数</p>
 */
public class CountBits {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = countOnes(i);
        }
        return ans;
    }

    private static int countOnes(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num >>>= 1;
        }
        return count;
    }
}
