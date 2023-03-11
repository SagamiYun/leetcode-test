package easy;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author SagamiYun
 * @version 2023/3/11
 * <p>@ClassName PreorderTraversal</p>
 * <p>@Description 如果当前节点不为空或栈不为空，则执行以下操作：
 * a. 如果当前节点不为空，将当前节点入栈，并将当前节点的值加入结果列表中。
 * b. 将栈顶节点出栈，并将当前节点指向栈顶节点的右子节点。
 * c. 将当前节点指向栈顶节点的左子节点。
 * 返回结果列表。 </p>
 * <p>144. 二叉树的前序遍历</p>
 */
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                result.add(root.val);
                root = root.left;
            }
            root = stack.pop().right;
        }
        return result;
    }
}
