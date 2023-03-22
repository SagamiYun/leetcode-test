package com.sagamiyun.mystudy.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName SummaryRanges</p>
 * <p>@Description 首先，我们创建一个名为result的ArrayList，用于存储结果。如果输入数组nums为null或长度为0，直接返回空结果列表。
 * 初始化两个变量start和end，它们将用于存储当前连续区间的起始和结束值。将它们都初始化为数组中的第一个元素nums[0]。
 * 使用一个for循环遍历数组中的其余元素。从索引i=1开始，直到nums.length - 1。
 * a. 如果当前元素nums[i]等于end值加1，表示连续区间在增加，更新end值为nums[i]。
 * b. 如果不满足上述条件，表示连续区间已经结束。根据start和end的值，向result列表中添加一个表示当前区间的字符串。然后将start和end值都更新为当前元素nums[i]，以开始下一个连续区间的查找。
 * 循环结束后，还需要处理最后一个连续区间。根据start和end的值，向result列表中添加一个表示最后区间的字符串。
 * 返回结果列表result。</p>
 * <p>228. 汇总区间</p>
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        int start = nums[0];
        int end = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                if (start == end) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + end);
                }
                start = end = nums[i];
            }
        }

        if (start == end) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + end);
        }

        return result;
    }
}
