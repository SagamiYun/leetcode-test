package com.sagamiyun.mystudy.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SagamiYun
 * @version 2023/4/1
 * <p>@ClassName FirstUniqChar</p>
 * <p>@Description 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。
 * 如果不存在，则返回 -1 基于HashMap实现</p>
 * <p>387. 字符串中的第一个唯一字符</p>
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {
        // 构建哈希表，key 为字符，value 为出现的次数
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 遍历字符串 s，查找第一个出现次数为 1 的字符的位置
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }

        // 如果找不到，则返回 -1
        return -1;
    }

}
