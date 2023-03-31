package com.sagamiyun.mystudy.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SagamiYun
 * @version 2023/3/30
 * <p>@ClassName Intersect</p>
 * <p>@Description 算法理念是使用哈希表，用一个哈希表统计 nums1 中每个数字出现的次数，
 * 然后遍历 nums2，如果当前数字在哈希表中出现过，则将该数字加入结果集中，并将对应计数减一。 </p>
 * <p>350. 两个数组的交集 II</p>
 */
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // 遍历 nums1，统计每个数字出现的次数
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        // 遍历 nums2，如果当前数字在 countMap 中出现过，则将该数字加入结果集中
        for (int num : nums2) {
            int count = countMap.getOrDefault(num, 0);
            if (count > 0) {
                resultList.add(num);
                countMap.put(num, count - 1);
            }
        }

        // 将结果集转为数组
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
