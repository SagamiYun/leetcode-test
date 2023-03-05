package easy;

import tree.TreeNode;

/**
 * @author SagamiYun
 * @version 2023/3/3
 * <p>@ClassName SortedArrayToBST</p>
 * <p>@Description 定义构建平衡二叉搜索树的函数 buildBST，传入数组和起始索引、结束索引，返回构建好的平衡二叉搜索树的根节点。
 * 如果起始索引大于结束索引，返回 null。
 * 计算中间元素的索引 mid = (start + end) / 2，以该元素为根节点创建一个新的节点 root。
 * 递归构建左子树，调用 buildBST(nums, start, mid - 1)，将返回值作为 root 的左子节点。
 * 递归构建右子树，调用 buildBST(nums, mid + 1, end)，将返回值作为 root 的右子节点。
 * 返回根节点 root。 </p>
 * <p>108. 将有序数组转换为二叉搜索树</p>
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(nums, start, mid - 1);
        root.right = buildBST(nums, mid + 1, end);
        return root;
    }
}
