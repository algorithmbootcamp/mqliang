package tree;

public class Q623_Add_One_Row_to_Tree_B {

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (root == null) {
            return root;
        }
        if (d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }
        if (d == 2) {
            TreeNode l = root.left;
            TreeNode r = root.right;
            root.left = new TreeNode(v);
            root.left.left = l;
            root.right = new TreeNode(v);
            root.right.right = r;
            return root;
        }
        root.left = addOneRow(root.left, v, d - 1);
        root.right = addOneRow(root.right, v, d - 1);
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
