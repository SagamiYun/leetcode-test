package com.sagamiyun.mystudy.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SagamiYun
 * @version 2023/3/26
 * <p>@ClassName WordPattern</p>
 * <p>@Description 首先将字符串s按空格分割，以获得一个单词数组words。
 * 检查模式字符串pattern和words数组的长度。如果它们的长度不相等，则返回false，因为它们不能匹配。
 * 初始化两个HashMap：patternToWord（用于存储模式中的字符到单词的映射）和wordToPattern（用于存储单词到模式中的字符的映射）。
 * 使用一个循环遍历模式字符串pattern中的每个字符：
 * a. 获取当前模式字符currentPattern和对应的单词currentWord。
 * b. 如果patternToWord包含currentPattern，并且对应的值与currentWord不相等，则返回false。
 * c. 如果wordToPattern包含currentWord，并且对应的值与currentPattern不相等，则返回false。
 * d. 在patternToWord和wordToPattern中添加当前映射关系。
 * 如果循环执行完毕，没有提前返回false，则返回true，表示字符串s遵循给定的模式` </p>
 * <p>290. 单词规律</p>
 */
public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> patternToWord = new HashMap<>();
        Map<String, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentPattern = pattern.charAt(i);
            String currentWord = words[i];

            if (patternToWord.containsKey(currentPattern) && !patternToWord.get(currentPattern).equals(currentWord)) {
                return false;
            }
            if (wordToPattern.containsKey(currentWord) && !wordToPattern.get(currentWord).equals(currentPattern)) {
                return false;
            }

            patternToWord.put(currentPattern, currentWord);
            wordToPattern.put(currentWord, currentPattern);
        }

        return true;
    }
}
