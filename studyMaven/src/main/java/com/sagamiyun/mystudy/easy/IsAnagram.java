package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName IsAnagram</p>
 * <p>@Description TODO </p>
 * <p>@Date 2023/3/22 18:24</p>
 */

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
