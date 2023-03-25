package com.sagamiyun.mystudy.easy;

import com.sagamiyun.mystudy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SagamiYun
 * @version 2023/3/25
 * <p>@ClassName BinaryTreePaths</p>
 * <p>@Description 可以使用深度优先搜索（DFS）遍历二叉树。 </p>
 * <p>257. 二叉树的所有路径</p>
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        dfs(root, "", paths);
        return paths;
    }

    private void dfs(TreeNode node, String path, List<String> paths) {
        if (node.left == null && node.right == null) {
            paths.add(path + node.val);
            return;
        }

        if (node.left != null) {
            dfs(node.left, path + node.val + "->", paths);
        }

        if (node.right != null) {
            dfs(node.right, path + node.val + "->", paths);
        }
    }
}
