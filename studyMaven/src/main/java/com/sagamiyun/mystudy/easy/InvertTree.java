package com.sagamiyun.mystudy.easy;

import com.sagamiyun.mystudy.tree.TreeNode;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName InvertTree</p>
 * <p>@Description TODO </p>
 * <p>@Date 2023/3/22 15:56</p>
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
