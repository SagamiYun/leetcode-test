package easy;

import java.util.Stack;

/**
 * @author SagamiYun
 * @version 2023/2/4
 * <p>@ClassName IsValid</p>
 * <p>@Description 使用一个栈维护左括号，遍历字符串，
 * 如果遇到左括号，就将左括号入栈，如果遇到右括号，判断栈是否为空，
 * 如果为空直接返回 false，否则将栈顶元素弹出并与当前右括号进行匹配，
 * 如果不匹配直接返回 false，如果遍历完字符串之后栈仍然不为空，返回 false。
 * 如果以上条件都不满足，最终返回 true。 </p>
 * <p>20. 有效的括号</p>
 */
public class IsValid {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
