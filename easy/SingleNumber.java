package easy;

/**
 * @author SagamiYun
 * @version 2023/3/6
 * <p>@ClassName SingleNumber</p>
 * <p>@Description 这里用到了异或运算的性质：对于任何数 x，都有 x ^ x = 0，x ^ 0 = x，
 * 异或满足交换律和结合律。因此，将所有数进行异或操作，出现两次的数字都变成了 0，最终得到的结果就是只出现一次的数字。时间复杂度为 O(n)，空间复杂度为 O(1)。 </p>
 * <p>136. 只出现一次的数字</p>
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
