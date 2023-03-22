package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/12
 * <p>@ClassName ConvertToTitle</p>
 * <p>@Description 这个方法通过不断取余数和除以26来转换整数为Excel表格列名称。
 * 需要注意的是，Excel表格列名称是从A开始，而且是从1开始计数，因此需要将整数减一，
 * 转换为从0开始计数的列索引。同时需要反转字符串，才能得到正确的列名称。 </p>
 * <p>168. Excel表列名称</p>
 */
public class ConvertToTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            char ch = (char) ('A' + remainder);
            sb.append(ch);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
