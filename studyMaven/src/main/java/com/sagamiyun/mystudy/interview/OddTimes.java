package com.sagamiyun.mystudy.interview;

/**
 * 有一个数组，有一种数出现偶数次，其他数出现偶数次，
 * 或有两个数出现偶数次，其他数出现偶数次，怎么求出对应的值
 * 要求时间复杂度为On
 * */

public class OddTimes {
    public static void printOddTimes(int[] arr) {
        int eor = 0;
        for (int cur : arr) {
            eor ^= cur;
        }
        System.out.println(eor);
    }

    public static void printOddTimesTwo(int[] arr) {
        int eor = 0, onlyOne = 0;
        for (int curNum : arr) {
            eor ^= curNum;
        }
        //求出最右方相差异1
        int rightOne = eor & (~eor + 1);
        for (int cur : arr) {
            if ((cur & rightOne) == 0) {
                onlyOne ^= cur;
            }
        }
        System.out.println(onlyOne + "" + (eor ^ onlyOne));
    }

}
