package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/25
 * <p>@ClassName MoveZeroes</p>
 * <p>@Description 使用for循环遍历数组中的每个元素。如果元素不等于0，
 * 则将该元素放到insertPosition的位置，并将insertPosition递增1。
 * 遍历结束后，将insertPosition到数组末尾的所有元素设为0 </p>
 * <p>283. 移动零</p>
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int insertPosition = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPosition++] = num;
            }
        }
        while (insertPosition < nums.length) {
            nums[insertPosition++] = 0;
        }
    }
}
