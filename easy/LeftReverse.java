package easy;

/**
 * @author SagamiYun
 * @version 2023/2/2
 * <p>@ClassName LeftReverse<p/>
 * <p>剑指 Offer 58 - II. 左旋转字符串<p/>
 */
public class LeftReverse {
    public static String leftRotate(String str, int k) {
        if (str == null || str.length() == 0 || k <= 0) {
            return str;
        }
        k = k % str.length();
        str = reverse(str, 0, k - 1);
        str = reverse(str, k, str.length() - 1);
        str = reverse(str, 0, str.length() - 1);
        return str;

        // 最优解
        // return str.substring(k) + str.substring(0, k);
    }

    private static String reverse(String str, int start, int end) {
        char[] chars = str.toCharArray();
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
