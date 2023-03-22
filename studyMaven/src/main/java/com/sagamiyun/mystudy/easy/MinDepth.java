package com.sagamiyun.mystudy.easy;

import com.sagamiyun.mystudy.tree.TreeNode;

/**
 * @author SagamiYun
 * @version 2023/3/5
 * <p>@ClassName MinDepth</p>
 * <p>@Description TODO </p>
 * <p>111. 二叉树的最小深度</p>
 */
public class MinDepth {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
