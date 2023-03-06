package easy;

import tree.TreeNode;

/**
 * @author SagamiYun
 * @version 2023/3/5
 * <p>@ClassName IsBalanced</p>
 * <p>@Description 对于每个节点，首先计算其左右子树的高度差，若其高度差超过 1，
 * 则该二叉树不是高度平衡的，直接返回 false；若其高度差不超过 1，
 * 则递归判断其左右子树是否是高度平衡的二叉树，如果均满足，则该二叉树也是高度平衡的二叉树。 </p>
 * <p>110. 平衡二叉树</p>
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
