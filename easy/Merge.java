package easy;

/**
 * @author SagamiYun
 * @version 2023/3/2
 * <p>@ClassName Merge</p>
 * <p>@Description 定义三个指针 i、j 和 k，分别指向 nums1 的末尾、nums2 的末尾和 nums1 的末尾（即合并后的数组的末尾）。
 * 比较 nums1[i] 和 nums2[j] 的大小，将较大的值放入 nums1[k] 中，同时将对应的指针向前移动一位。
 * 重复步骤2，直到有一个指针移动到了数组的开头。
 * 如果此时 nums2 中还有剩余元素，将剩余元素全部放入 nums1 中。 </p>
 * <p>88. 合并两个有序数组</p>
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
