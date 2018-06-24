package tree;

import java.util.Scanner;

public class Q297_Serialize_and_Deserialize_Binary_Tree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        return String.valueOf(root.val) + " " + serialize(root.left) + " " + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return build(new Scanner(data));
    }

    private TreeNode build(Scanner sc) {
        if (!sc.hasNext()) {
            return null;
        }
        String token = sc.next();
        if (token.equals("#")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(token));
        root.left = build(sc);
        root.right = build(sc);
        return root;
    }

}
