package easy;

/**
 * @author SagamiYun
 * @version 2023/3/6
 * <p>@ClassName IsPalindrome</p>
 * <p>@Description 这里使用了Java字符串的toLowerCase()方法将所有大写字符转换为小写字符，
 * 并使用replaceAll()方法移除所有非字母数字字符。然后使用双指针法从字符串两端开始比较字符是否相同，
 * 如果存在不相同的字符则返回false，否则返回true。 </p>
 * <p>125. 验证回文串</p>
 */
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        s = s.toLowerCase().replaceAll("[^a-zA-Z\\d]", "");
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
