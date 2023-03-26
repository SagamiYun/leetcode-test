package com.sagamiyun.mystudy.easy;

/**
 * @author SagamiYun
 * @version 2023/3/26
 * <p>@ClassName NumArray</p>
 * <p>@Description 该类有两个实例变量：nums和sum。nums存储输入数组，
 * 而sum存储累积和。NumArray构造函数初始化nums和sum，然后计算累积和。
 * sumRange方法接收两个参数i和j，表示查询的范围。该方法返回索引i和j之间（包含i和j）元素的总和。
 * 如果i为0，则直接返回sum[j]；否则，返回sum[j] - sum[i - 1]。 </p>
 * <p>303. 区域和检索 - 数组不可变</p>
 */
public class NumArray {

    private int[] nums;
    private int[] sum;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.sum = new int[nums.length];
        if (nums.length > 0) {
            sum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sum[i] = sum[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return sum[j];
        } else {
            return sum[j] - sum[i - 1];
        }
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }
}
