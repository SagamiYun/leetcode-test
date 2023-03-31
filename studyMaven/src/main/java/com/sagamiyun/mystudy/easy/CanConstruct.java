package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/4/1
 * <p>@ClassName CanConstruct</p>
 * <p>@Description 将两个字符串转换为字符数组，然后遍历 ransomNote 的每个字符，
 * 判断是否在 magazine 中出现，并在 magazine 中删除该字符 </p>
 * <p>383. 赎金信</p>
 */
public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 将两个字符串转换为字符数组
        char[] ransomArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();

        // 遍历 ransomNote 中的每个字符
        for (char c : ransomArray) {
            // 判断该字符是否在 magazine 中出现
            int index = indexOf(magazineArray, c);

            // 如果没有出现，则返回 false
            if (index == -1) {
                return false;
            }

            // 在 magazine 中删除该字符
            deleteChar(magazineArray, index);
        }

        // 如果遍历完 ransomNote 中的所有字符都能在 magazine 中找到对应的字符，则返回 true
        return true;
    }

    // 在字符数组中查找指定字符的位置
    private int indexOf(char[] array, char c) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                return i;
            }
        }
        return -1;
    }

    // 在字符数组中删除指定位置的字符
    private void deleteChar(char[] array, int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = '\0'; // 最后一个字符赋值为'\0'
    }
}
