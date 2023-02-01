package easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author SagamiYun
 * @version 2023/2/2
 * <p>@ClassName TestMain<p/>
 * <p>@Date 2023/2/2 5:18<p/>
 */
public class TestMain {
    public static void main(String[] args) {
        // 左字符串颠倒
        // System.out.println(leftRe());

        // 两数之和
        System.out.println(Arrays.toString(twoNumSun()));
    }

    private static String leftRe(){
        String s = "lrloseumgh";
        int k = 6;
        return LeftReverse.leftRotate(s, k);
    }

    private static int[] twoNumSun() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        return twoSum.twoSum(nums, target);
    }
}
