package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/2/3
 * <p>@ClassName LongestCommonPrefix</p>
 * <p>@Description 首先判断字符串数组是否为空，如果是空的则返回空字符串。
 * 如果字符串数组只有一个元素，则直接返回该元素。
 * 遍历字符串数组，找到最短的字符串长度。
 * 采用二分法，判断每个字符串是否以某一个长度为 len 的字符串为前缀。
 * 如果是公共前缀，则把 low 设为 middle + 1，继续二分；否则把 high 设为 middle - 1。
 * 返回最长公共前缀，即 strs[0].substring(0, (low + high) / 2)。 </p>
 * <p>14. 最长公共前缀</p>
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }
        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        String str1 = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(str1)) {
                return false;
            }
        }
        return true;
    }
}
