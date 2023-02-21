package easy;

/**
 * @author SagamiYun
 * @version 2023/2/14
 * <p>@ClassName AddBinary</p>
 * <p>@Description 计算两个字符串的长度，并找到较长的那一个字符串
 * 从末位开始，从两个字符串中每一位转成数字，并累加计算。
 * 如果有进位，那么需要将进位标志置为1，否则置为0
 * 将每一位的结果（和+进位）的个位存入答案的相应位置。
 * 当循环到字符串首位时，需要判断是否还有进位标志，如果有，需要将结果在首位加1。 </p>
 * <p>67. 二进制求和</p>
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            res.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
