package easy;

import normal.LRUCache;
import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author SagamiYun
 * @version 2023/2/2
 * <p>@ClassName TestMain</p>
 * <p>@Date 2023/2/2 5:18</p>
 */
public class TestMain {
    public static void main(String[] args) {
        // 左字符串颠倒
        // System.out.println(leftRe());

        // 两数之和
        // System.out.println(Arrays.toString(twoNumSun()));

        // 回文数
        // System.out.println(testPalindrome());

        // 罗马数字转数字
        // System.out.println(testRomanToInt());

        // 最长公共前缀
        // System.out.println(testLongestCommonPrefix());

        // 判断有效的括号
        // System.out.println(testIsValid());

        // 合并两个链表为有序链表
        // System.out.println(testMergeTwoLists());

        // 删除有序数组中的重复项
        // System.out.println(testRemoveDuplicates());

        // 移除元素
        // System.out.println(testRemoveElement());

        // 搜索插入位置
        // System.out.println(testSearchInsert());

        // 最后一个单词的长度
        // System.out.println(testLengthOfLastWord());

        // 加一
        // System.out.println(Arrays.toString(testPlusOne()));

        // 二进制求和
        // System.out.println(testAddBinary());

        // x的平方根
        // System.out.println(testMySqrt());

        // 爬楼梯
        // System.out.println(testClimbStairs());

        // 删除排序链表中的重复元素
        // System.out.println(testDeleteDuplicates());

        // 合并两个有序数组
        // System.out.println(Arrays.toString(testMerge()));

        // 二叉树的中序遍历
        // System.out.println(testInorderTraversal());

        // 判断两个二叉树是否相同
        // System.out.println(isSameTreeTest());

        // 测试二叉树是否轴对称
        // System.out.println(testIsSymmetric());

        // 二叉树最大深度
        // System.out.println(testMaxDepth());

        // 数组转换高度平衡二叉树
        // System.out.println(testSortedArrayToBST());

        // 判断平衡二叉树
        // System.out.println(testIsBalanced());

        // 找出最小深度二叉树
        // System.out.println(testMinDepth());

        // 判断路径总和
        // System.out.println(testHasPathSum());

        // 杨辉三角
        // System.out.println(testGenerate());

        // 根据rowIndex返回对应的行数据
        // System.out.println(testGetRow());

        // 购买股票的最佳时机
        // System.out.println(testMaxProfit());

        // 验证翻转字符串
        // System.out.println(testIsPalindrome());

        // 只出现一次的数字
        // System.out.println(testSingleNumber());

        // LRU算法
        // System.out.println(testLRUCache());

        // 环形链表检测
        // System.out.println(testHasCycle());

        // 二叉树前序遍历
        // System.out.println(testPreorderTraversal());

        // 二叉树后序遍历
        // System.out.println(testPostorderTraversal());

        // 根据整数求得Excel中的列名称
        // System.out.println(testConvertToTitle());

        // 给定一个大小为n的数组nums，返回其中的多数元素
        // System.out.println(testMajorityElement());

        // 求出双链表的交叉点
        // System.out.println(testGetIntersectionNode());

        // 颠倒给定的二进制位
        // System.out.println(testReverseBits());

        // 位1的个数
        System.out.println(testHammingWeight());
    }

    private static String leftRe(){
        String s = "lrloseumgh";
        int k = 6;
        return LeftReverse.leftRotate(s, k);
    }

    private static int[] twoNumSun() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        return twoSum.twoSum(nums, target);
    }

    private static boolean testPalindrome() {
        int num = 1222231;
        return Palindrome.isPalindrome(num);
    }

    private static int testRomanToInt() {
        RomanToInt romanToInt = new RomanToInt();
        String s = "MCMXCIV";
        return romanToInt.romanToInt(s);
    }

    private static String testLongestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        return longestCommonPrefix.longestCommonPrefix(strs);
    }

    private static boolean testIsValid() {
        String s = "()[]{}";
        return IsValid.isValid(s);
    }

    private static ArrayList<Integer> testMergeTwoLists() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode nodeList2 = new ListNode(4);
        ListNode nodeList1 = new ListNode(2, nodeList2);
        ListNode nodeList = new ListNode(1, nodeList1);
        ListNode secNodeList2 = new ListNode(4);
        ListNode secNodeList1 = new ListNode(3, secNodeList2);
        ListNode secNodeList = new ListNode(1, secNodeList1);
        ListNode listNode = mergeTwoLists.mergeTwoLists(nodeList, secNodeList);

        ArrayList<Integer> listNodes = new ArrayList<>();
        while (true) {
            listNodes.add(listNode.val);
            if (listNode.next == null) {
                break;
            }
            listNode = listNode.next;
        }

        return listNodes;
    }

    private static int testRemoveDuplicates() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        return removeDuplicates.removeDuplicates(nums);
    }

    private static int testRemoveElement() {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3,2,2,3};
        int value = 3;
        return removeElement.removeElement(nums, value);
    }

    private static int testSearchInsert() {
        SearchInsert searchInsert = new SearchInsert();
        int[] nums = {1,3,5,6};
        int target = 2;
        return searchInsert.searchInsert(nums, target);
    }

    private static int testLengthOfLastWord() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String s = "Hello World";
        return lengthOfLastWord.lengthOfLastWord(s);
    }

    private static int[] testPlusOne() {
        PlusOne plusOne = new PlusOne();
        int[] digits = {1,2,3};
        return plusOne.plusOne(digits);
    }

    private static String testAddBinary() {
        AddBinary addBinary = new AddBinary();
        String a = "11", b = "1";
        return addBinary.addBinary(a, b);
    }

    private static int testMySqrt() {
        MySqrt mySqrt = new MySqrt();
        int x = 8;
        return mySqrt.mySqrt(x);
    }

    private static int testClimbStairs() {
        ClimbStairs climbStairs = new ClimbStairs();
        int n = 2;
        return climbStairs.climbStairs(n);
    }

    private static ArrayList<Integer> testDeleteDuplicates() {
        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        ListNode result = deleteDuplicates.deleteDuplicates(head);
        ArrayList<Integer> nums = new ArrayList<>();
        while (result != null) {
            nums.add(result.val);
            result = result.next;
        }
        return nums;
    }

    private static int[] testMerge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        Merge merge = new Merge();

        merge.merge(nums1, 3, nums2, 3);

        return nums1;
    }

    private static List<Integer> testInorderTraversal() {
        // 构建一棵二叉树
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InorderTraversal solution = new InorderTraversal();
        return solution.inorderTraversal(root);
    }

    private static Boolean isSameTreeTest() {
        TreeNode p2 = null;
        TreeNode q2 = new TreeNode(1);
        IsSameTree isSameTree = new IsSameTree();
        return isSameTree.isSameTree(p2, q2);
    }

    private static Boolean testIsSymmetric() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        IsSymmetric isSymmetric = new IsSymmetric();
        return isSymmetric.isSymmetric(root);
    }

    private static Integer testMaxDepth() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        MaxDepth maxDepth = new MaxDepth();
        return maxDepth.maxDepth(root);
    }

    private static List<Integer> testSortedArrayToBST() {
        int[] nums4 = {1, 2, 3, 4, 5};
        List<Integer> res = new ArrayList<>();
        SortedArrayToBST sortedArrayToBST = new SortedArrayToBST();
        TreeNode treeNode = sortedArrayToBST.sortedArrayToBST(nums4);
        inorder(treeNode, res);
        return res;
    }

    private static void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    private static boolean testIsBalanced() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        return new IsBalanced().isBalanced(root);
    }

    private static Integer testMinDepth() {
        TreeNode treeNode = generateRandomTree(3);

        return new MinDepth().minDepth(treeNode);
    }

    private static Boolean testHasPathSum() {
        return new HasPathSum().hasPathSum(generateRandomTree(3), 3);
    }

    private static List<List<Integer>> testGenerate() {
        return new Generate().generate(5);
    }

    private static List<Integer> testGetRow() {
        return new GetRow().getRow(3);
    }

    private static Integer testMaxProfit() {
        int[] nums = {7, 1, 5, 3, 6, 4};
        return new MaxProfit().maxProfit(nums);
    }

    private static Boolean testIsPalindrome() {
        return new IsPalindrome().isPalindrome("acdca");
    }

    private static Integer testSingleNumber() {
        int[] nums = {2, 2, 1};
        return new SingleNumber().singleNumber(nums);
    }

    private static ArrayList<Integer> testLRUCache() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 4; i > 0; i--) {
            integers.add(cache.get(i));
        }

        return integers;
    }

    private static boolean testHasCycle() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;


        return new HasCycle().hasCycle(head);
    }

    private static List<Integer> testPreorderTraversal() {
        return new PreorderTraversal().preorderTraversal(generateRandomTree(4));
    }

    private static List<Integer> testPostorderTraversal() {
        return new PostorderTraversal().postorderTraversal(generateRandomTree(3));
    }

    private static String testConvertToTitle() {
        return new ConvertToTitle().convertToTitle(35);
    }

    private static Integer testMajorityElement() {
        return new MajorityElement().majorityElement(new int[]{3, 2, 3});
    }

    private static Integer testReverseBits() {
        return new ReverseBits().reverseBits(43261596);
    }

    private static Integer testHammingWeight() {
        return new HammingWeight().hammingWeight(3527);
    }

    private static Integer testGetIntersectionNode() {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(8);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);
        headB.next.next.next = headA.next.next;
        return new GetIntersectionNode().getIntersectionNode(headA, headB).val;
    }

    /**
     * 生成指定层数随机节点树
     */
    private static TreeNode generateRandomTree(int maxDepth) {
        // 叶子节点
        if (maxDepth == 0) {
            return null;
        }
        Random random = new Random();
        // 生成随机值
        int val = random.nextInt(100);
        // 构造节点
        TreeNode node = new TreeNode(val);
        // 随机生成左子树
        node.left = generateRandomTree(maxDepth - 1);
        // 随机生成右子树
        node.right = generateRandomTree(maxDepth - 1);
        return node;
    }
}
