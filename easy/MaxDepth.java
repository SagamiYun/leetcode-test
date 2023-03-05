package easy;

import tree.TreeNode;

/**
 * @author SagamiYun
 * @version 2023/3/3
 * <p>@ClassName MaxDepth</p>
 * <p>@Description maxDepth() 方法采用递归实现，如果根节点为空，
 * 则返回 0；否则，递归计算左子树和右子树的深度，然后取较大值加 1 作为当前节点的深度，并返回该深度。 </p>
 * <p>二叉树的最大深度</p>
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
}
