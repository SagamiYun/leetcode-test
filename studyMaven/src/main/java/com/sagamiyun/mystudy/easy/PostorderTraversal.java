package com.sagamiyun.mystudy.easy;

import com.sagamiyun.mystudy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author SagamiYun
 * @version 2023/3/11
 * <p>@ClassName PostorderTraversal</p>
 * <p>@Description 递归实现后序遍历的过程如下：
 * 如果当前节点为空，则直接返回。
 * 递归遍历左子树。
 * 递归遍历右子树。
 * 访问当前节点，将当前节点的值加入结果列表中。
 *
 * 迭代实现后序遍历的过程比较复杂，需要使用两个栈来辅助遍历。具体的实现步骤如下：
 * 将根节点入栈1。
 * 当栈1不为空时，执行以下操作：
 * a. 将栈1的栈顶元素弹出，并将其入栈2。
 * b. 将栈1的栈顶元素的左右子节点依次入栈1。
 * 当栈2不为空时，依次将栈2的元素弹出，并将其值加入结果列表中。
 * </p>
 * <p>145. 二叉树的后序遍历</p>
 */
public class PostorderTraversal {
    /*
      递归
     */
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     List<Integer> result = new ArrayList<>();
    //     if (root == null) {
    //         return result;
    //     }
    //     result.addAll(postorderTraversal(root.left));
    //     result.addAll(postorderTraversal(root.right));
    //     result.add(root.val);
    //     return result;
    // }


    /**
     * 迭代
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()) {
            result.add(stack2.pop().val);
        }
        return result;
    }
}
