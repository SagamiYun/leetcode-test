package easy;

/**
 * @author SagamiYun
 * @version 2023/2/14
 * <p>@ClassName LengthOfLastWord<p/>
 * <p>@Description  使用 split() 方法将字符串 s 分割成数组，以空格作为分隔符。
 * 如果数组的长度为 0，说明字符串中不包含单词，返回 0。
 * 如果字符串中包含单词，则返回数组最后一个单词的长度，即返回 arr[arr.length - 1].length()。 <p/>
 * <p>58. 最后一个单词的长度<p/>
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        if (arr.length == 0) {
            return 0;
        }
        return arr[arr.length - 1].length();
    }
}
