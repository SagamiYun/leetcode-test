package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName IsIsomorphic</p>
 * <p>@Description 该方法使用两个数组来记录字符之间的映射关系，
 * 遍历两个字符串并比较它们的映射关系，如果发现不同构关系，则返回false。 </p>
 * <p>205. 同构字符串</p>
 */
public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sToT = new int[128];
        int[] tToS = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sToT[sChar] == 0 && tToS[tChar] == 0) {
                sToT[sChar] = tChar;
                tToS[tChar] = sChar;
            } else if (sToT[sChar] != tChar || tToS[tChar] != sChar) {
                return false;
            }
        }

        return true;
    }
}
