package com.sagamiyun.mystudy.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName ContainsDuplicate</p>
 * <p>@Description TODO </p>
 * <p>217. 存在重复元素</p>
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
