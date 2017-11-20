package Q100_Q199;

public class Q112_Path_Sum {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
       if (root == null) return false;
       if (root.left == null && root.right == null) return root.val == sum;

       return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }

}