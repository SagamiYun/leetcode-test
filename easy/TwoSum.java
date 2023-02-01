package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SagamiYun
 * @version 2023/2/2
 * <p>@ClassName TwoSum<p/>
 * <p>@Description  这段代码实现了一个简单的两数之和算法。
 * 首先，它创建了一个HashMap，并将数组中的每个数存储在该Map中。
 * 然后，它迭代数组，对于每个数，它计算出它的补数（即，它的目标值与它相减的结果）。
 * 如果该补数存在于HashMap中，则表示它已经找到了两数之和等于目标值的答案，并将这两个数的下标作为结果数组返回。
 * 如果未找到匹配项，则该函数抛出一个非法参数异常，指示没有找到两数之和的解决方案。<p/>
 * <p>1. 两数之和<p/>
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
