package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/2/3
 * <p>@ClassName RomanToInt</p>
 * <p>@Description 这段代码背后的逻辑是从左到右遍历罗马数字字符串，
 * 并根据每个符号的值是否大于或小于前一个符号将其添加或减去结果。 </p>
 * <p>13. 罗马数字转整数</p>
 */
public class RomanToInt {
    public int romanToInt(String s) {
        // 罗马数字的一个规律，第x位若比第x+1位小，则为减法，若x位比x+1位大，则为加法。
        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = 0;
        int prev = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int curr = getValue(s.charAt(i));
            if (prev < curr) {
                result -= prev;
            } else {
                result += prev;
            }
            prev = curr;
        }
        result += prev;
        return result;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
