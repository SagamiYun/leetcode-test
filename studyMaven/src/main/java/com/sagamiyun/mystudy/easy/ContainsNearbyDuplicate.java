package com.sagamiyun.mystudy.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName ContainsNearbyDuplicate</p>
 * <p>@Description 这个方法使用一个HashMap存储数组中的元素及其索引，
 * 遍历数组时检查元素是否已经存在于HashMap中，如果存在并且索引差满足条件，
 * 则返回true；否则更新HashMap中的元素索引。 </p>
 * <p>219. 存在重复元素 II</p>
 */
public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
