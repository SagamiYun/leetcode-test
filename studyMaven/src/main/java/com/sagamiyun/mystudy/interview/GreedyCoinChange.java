package com.sagamiyun.mystudy.interview;

import java.util.Arrays;

/**
 * com.sagamiyun.mystudy.interview.GreedyCoinChange 经典贪心
 * @author SagamiYun
 */
public class GreedyCoinChange {
    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25};
        int amount = 63;
        System.out.println(coinChange(coins, amount));
    }
}
