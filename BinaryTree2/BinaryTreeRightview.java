package BinaryTree2;

public class BinaryTreeRightview {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void rightViewUtil(TreeNode node, int level, int[] maxLevel) {
        if (node == null) {
            return;
        }
        if (level > maxLevel[0]) {
            System.out.print(node.val + " ");
            maxLevel[0] = level;
        }
        rightViewUtil(node.right, level + 1, maxLevel);
        rightViewUtil(node.left, level + 1, maxLevel);
    }

    public static void printRightView(TreeNode root) {
        int[] maxLevel = {0};
        rightViewUtil(root, 1, maxLevel);
    }

    public static void main(String[] args) {    
        /*
        Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
         */
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        System.out.print("Right view of the binary tree: ");
        printRightView(root);
    }
}
