package easy;

/**
 * @author SagamiYun
 * @version 2023/2/3
 * <p>@ClassName Palindrome<p/>
 * <p>@Description 这段代码的思路是判断给定的整数是否是回文整数。
 * 首先将整数转换为字符串，然后使用循环遍历字符串的每一个字符，判断从头到尾的字符是否和从尾到头的字符相同。
 * 如果一直相同，则返回true，否则返回false。 <p/>
 * <p>9. 回文数<p/>
 */
public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverse = 0;
        while (x > reverse) {
            // 首先求出x的最后一位数字，即x % 10
            // 将最后一位数字加入到翻转的整数中，如reverse = reverse * 10 + x % 10，此时翻转的整数变为最后一位数字在最高位（个位）
            // 对原整数x进行除以10操作，即x /= 10，去除最后一位数字，使得原整数的长度减少
            // 重复上面两个步骤，直到原整数x除以10变为0，得到最终的翻转整数reverse
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        return x == reverse || x == reverse / 10;

        // 高效（搞笑）解法
        // if(x<0)return false;
        // if(x==10)return false;
        // if(x==100)return false;
        // if(x==123)return false;
        // if(x==213)return false;
        // if(x==1122)return false;
        // if(x==123123)return false;
        // if(x==1000021)return false;
        // if(x==500)return false;
        // if(x==21120)return false;
        // if(x==131000)return false;
        // if(x==10000021)return false;
        // if(x==10022201)return false;
        // if(x==120030221)return false;
        // if(x==1234567899)return false;
        // if(x==1000030001)return false;
        // if(x==2147483647)return false;
        // if(x==1234567899)return false;
        // return true;
    }
}
