package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/4/1
 * <p>@ClassName FindTheDifference</p>
 * <p>@Description 在该方法中，我们首先将变量 result 初始化为 0，然后对字符串 s 和字符串 t 中每个字符进行异或运算，
 * 出现次数相同的字符会被相互抵消，只有在 t 中被添加的字符会留下来。最终，异或运算结果就是被添加的字符。 </p>
 * <p>389. 找不同</p>
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        // 构建两个字符数组，分别存储字符串 s 和字符串 t 中每个字符出现的次数
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            tCount[t.charAt(i) - 'a']++;
        }

        // 在字符串 t 中查找出现次数不同的字符
        for (int i = 0; i < 26; i++) {
            if (sCount[i] != tCount[i]) {
                return (char) (i + 'a');
            }
        }

        // 如果找不到，返回空字符 '\0'
        return '\0';
    }

}
