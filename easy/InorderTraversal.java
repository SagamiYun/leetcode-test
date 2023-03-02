package easy;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author SagamiYun
 * @version 2023/3/2
 * <p>@ClassName InorderTraversal</p>
 * <p>@Description 栈实现中序遍历的过程需要维护一个栈，先将根节点入栈，
 * 然后将左子树的所有节点入栈，最后访问栈顶节点，再将右子树的所有节点入栈。 </p>
 * <p>94. 二叉树的中序遍历</p>
 */
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            res.add(node.val);
            node = node.right;
        }
        return res;
    }
}
