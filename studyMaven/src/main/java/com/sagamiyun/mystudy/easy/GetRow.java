package com.sagamiyun.mystudy.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author SagamiYun
 * @version 2023/3/5
 * <p>@ClassName GetRow</p>
 * <p>@Description 使用动态规划来解决此问题，具体思路如下：
 * 初始化一维数组dp[]，数组长度为rowIndex+1，初始值为1。
 * 从第三行开始循环，每行从后往前遍历，更新当前位置的值为dp[j]+dp[j-1]，直到第一位，此时第一位的值为1。
 * 最终返回dp数组。 </p>
 * <p>119. 杨辉三角 II</p>
 */
public class GetRow {
    public List<Integer> getRow(int rowIndex) {
        int[] dp = new int[rowIndex+1];
        Arrays.fill(dp, 1);
        for (int i = 2; i <= rowIndex; i++) {
            for (int j = i - 1; j >= 1; j--) {
                dp[j] += dp[j-1];
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int num : dp) {
            result.add(num);
        }
        return result;
    }
}
