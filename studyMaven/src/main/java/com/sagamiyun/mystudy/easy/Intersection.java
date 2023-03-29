package com.sagamiyun.mystudy.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SagamiYun
 * @version 2023/3/29
 * <p>@ClassName Intersection</p>
 * <p>@Description 先创建了一个名为set1的HashSet，用于存储nums1数组中的唯一元素。然后，我们创建了一个名为resultSet的HashSet，
 * 用于存储交集结果。我们遍历nums2数组，如果当前元素在set1中存在，那么将它添加到resultSet。最后，
 * 我们将resultSet转换为一个整数数组result并返回。这个实现的时间复杂度为O(n+m)，其中n和m分别是两个输入数组的长度 </p>
 * <p>349. 两个数组的交集</p>
 */
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }
        return result;
    }
}
