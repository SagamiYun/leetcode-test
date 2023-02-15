package easy;

/**
 * @author SagamiYun
 * @version 2023/2/15
 * <p>@ClassName MySqrt<p/>
 * <p>@Description 可以使用二分查找来计算整数的算术平方根。
 * 假设我们要求整数 x 的算术平方根 sqrt，我们可以在区间 [0, x] 进行二分查找，其中左右指针分别为 left = 0, right = x。
 * 每次对区间进行二分，取中间位置 mid = (left + right) / 2，比较 mid 的平方与 x 的大小，
 * 如果 mid 的平方大于 x，则答案在左侧，即 right = mid - 1，否则答案在右侧，即 left = mid + 1。当 left > right 时，
 * 跳出二分查找，返回 right 即可。 <p/>
 * <p>69. x 的平方根 <p/>
 */
public class MySqrt {
    public int mySqrt(int x) {
        int left = 0, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long)mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
