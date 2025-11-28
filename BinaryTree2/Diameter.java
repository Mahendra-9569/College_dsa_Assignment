package BinaryTree2;;

public class Diameter {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    static int maxDiameter = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        depth(root);
        return maxDiameter;
    }   
    public static int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }
    public static void main(String[] args) {
        /*
        Given the root of a binary tree, return the length of the diameter of the tree.
        The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through theme root.
         */ 
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);               
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int result = diameterOfBinaryTree(root);
        System.out.println("Diameter of the tree: " + result);
    }   
}
