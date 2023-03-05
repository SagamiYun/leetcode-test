package easy;

import tree.TreeNode;

/**
 * @author SagamiYun
 * @version 2023/3/3
 * <p>@ClassName IsSameTree</p>
 * <p>@Description 我们首先判断 p 和 q 是否都为空，如果是，则说明它们相同；如果一个节点为空，
 * 一个节点非空，说明它们不相同；如果两个节点的值不相等， * 说明它们不相同。
 * 最后，我们分别递归判断 p 和 q 的左子树和右子树是否相同，如果都相同，则它们相同，否则它们不相同。 </p>
 * <p>100. 相同的树</p>
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 如果两个节点都为空，说明相同
        if (p == null && q == null) {
            return true;
        }
        // 如果一个节点为空，一个节点非空，说明不相同
        if (p == null || q == null) {
            return false;
        }
        // 如果两个节点的值不相等，说明不相同
        if (p.val != q.val) {
            return false;
        }
        // 判断两个节点的左子树和右子树是否相同
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
