package com.sagamiyun.mystudy.easy;

import com.sagamiyun.mystudy.tree.TreeNode;

/**
 * @author SagamiYun
 * @version 2023/3/5
 * <p>@ClassName HasPathSum</p>
 * <p>@Description hasPathSum方法用于判断是否存在根节点到叶子节点的路径，参数root表示二叉树的根节点，targetSum表示目标和。
 * 在方法中，首先判断当前节点是否为空，如果是则返回false。如果当前节点是叶子节点，判断当前节点的值是否等于目标和，如果是则返回true，否则返回false。
 * 如果当前节点不是叶子节点，则分别递归遍历左子树和右子树，将目标和减去当前节点的值，作为新的目标和传入递归函数，
 * 只有当左子树或右子树存在一条满足条件的路径时，整个树才存在满足条件的路径 </p>
 * <p>112. 路径总和</p>
 */
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
