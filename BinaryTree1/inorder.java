package BinaryTree1;

public class inorder {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);      
        System.out.print(root.val + " "); 
        inorderTraversal(root.right);     
    }

    public static void main(String[] args) {
        /*
        Given the root of a binary tree, perform an inorder traversal and print the values of the nodes.
         */
        
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        
        System.out.print("Inorder Traversal: ");
        inorderTraversal(root);
    }
}
