package easy;

/**
 * @author SagamiYun
 * @version 2023/2/14
 * <p>@ClassName PlusOne<p/>
 * <p>@Description 从数组的最后一位开始向前循环，如果当前位小于9，直接将该位加1并返回原数组；
 * 如果该位等于9，则将该位设为0；
 * 当循环到第一位时，如果第一位为0，则需要在原数组的基础上新建一个数组，并将新数组的第一位设为1。 <p/>
 * <p>66. 加一<p/>
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
