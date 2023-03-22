package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName TitleToNumber</p>
 * <p>@Description 这个方法的基本原理是将列名称视为一个以26为基数的数制，
 * 并把字母A到Z视为数字0到25。然后将列名称从右向左遍历，
 * 根据每个字符的位置计算其对应的权重并累加，最后得到列序号。 </p>
 * <p>171. Excel 表列序号</p>
 */
public class TitleToNumber {
    public int titleToNumber(String columnTitle) {
        int columnNumber = 0;
        int len = columnTitle.length();
        for (int i = 0; i < len; i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1;
            columnNumber = columnNumber * 26 + value;
        }
        return columnNumber;
    }
}
