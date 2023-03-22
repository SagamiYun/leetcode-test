package com.sagamiyun.mystudy.easy;

import com.sagamiyun.mystudy.tree.TreeNode;

/**
 * @author SagamiYun
 * @version 2023/3/3
 * <p>@ClassName IsSymmetric</p>
 * <p>@Description 我们定义了一个 isSymmetric() 方法，用来判断二叉树是否轴对称。
 * 该方法的入参为二叉树的根节点 root，返回一个布尔类型的结果。首先，我们先对特殊情况进行处理，如果根节点为空，
 * 直接返回 true。否则，我们调用 isSymmetric(TreeNode p, TreeNode q) 方法判断左右子树是否轴对称，将结果返回。
 * 在 isSymmetric(TreeNode p, TreeNode q) 方法中，我们定义了两个二叉树节点 p 和 q，表示两个子树的根节点，
 * 返回一个布尔类型的结果。首先，我们先对特殊情况进行处理，如果两个节点都为空，直接返回 true。如果两个节点中有一个为空，
 * 或者两个节点的值不相等，返回 false。否则，我们分别递归判断左右子树是否轴对称，将结果返回。 </p>
 * <p>101. 对称二叉树</p>
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }
}
