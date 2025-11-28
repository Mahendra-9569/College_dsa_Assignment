package BinaryTree1;

public class postorder {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static void postorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);      
        postorderTraversal(root.right);     
        System.out.print(root.val + " "); 
    }

    public static void main(String[] args) {
        /*
        Given the root of a binary tree, perform a postorder traversal and print the values of the nodes.
         */
        
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        
        System.out.print("Postorder Traversal: ");
        postorderTraversal(root);
    }
}
