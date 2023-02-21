package easy;

/**
 * @author SagamiYun
 * @version 2023/2/4
 * <p>@ClassName RemoveDuplicates</p>
 * <p>@Description 上述代码使用双指针法，
 * 两个指针分别指向不重复数组的最后一位（i）和当前遍历的数组位置（j）。
 * 如果当前位置的值不等于不重复数组的最后一位的值，
 * 那么i加1，并将当前位置的值赋给不重复数组的i位置。
 * 最后，返回不重复数组的长度。 </p>
 * <p>26. 删除有序数组中的重复项</p>
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
