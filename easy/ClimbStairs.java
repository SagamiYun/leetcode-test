package easy;

/**
 * @author SagamiYun
 * @version 2023/2/17
 * <p>@ClassName ClimbStairs</p>
 * <p>@Description 循环：使用两个变量 a 和 b 记录前两阶的方案数，
 * 通过循环更新 a 和 b 的值，直到求解到 n 阶的方案数。 </p>
 * <p>70. 爬楼梯</p>
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a = 1, b = 2, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
