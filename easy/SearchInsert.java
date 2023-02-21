package easy;

/**
 * @author SagamiYun
 * @version 2023/2/13
 * <p>@ClassName SearchInsert</p>
 * <p>@Description 首先，我们可以定义两个指针 left 和 right，分别指向数组的起始和结尾位置。
 * 接着，我们计算中间位置 mid = (left + right) / 2。
 * 如果中间位置的值等于目标值，则返回中间位置，如果中间位置的值大于目标值，
 * 则目标值可能在左边的子数组中，更新 right 为 mid - 1，否则目标值可能在右边的子数组中，更新 left 为 mid + 1。
 * 重复上述过程，直到找到目标值或 left > right。
 * 如果最终还没有找到目标值，则可以返回 left，因为此时 left 表示目标值将被插入的位置。 </p>
 * <p>35. 搜索插入位置</p>
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
