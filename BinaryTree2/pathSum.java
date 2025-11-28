package BinaryTree2;

public class pathSum {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        int newTargetSum = targetSum - root.val;
        return hasPathSum(root.left, newTargetSum) || hasPathSum(root.right, newTargetSum);
    }

    public static void main(String[] args) {
        /*
        Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
        A leaf is a node with no children.
         */
        
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;
        boolean result = hasPathSum(root, targetSum);
        System.out.println("Does the tree have a path sum of " + targetSum + "? " + result);
    }
}
