package BinaryTree1;

public class preorder {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " "); 
        preorderTraversal(root.left);      
        preorderTraversal(root.right);     
    }

    public static void main(String[] args) {
        /*
        Given the root of a binary tree, perform a preorder traversal and print the values of the nodes.
         */
        
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        
        System.out.print("Preorder Traversal: ");
        preorderTraversal(root);
    }
}
