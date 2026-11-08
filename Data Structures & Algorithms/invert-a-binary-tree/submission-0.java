/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
       // Base case (leaf node)
       if(root == null) {
        return null;
       }

       // if the root exist then swap left & right child of the current root->node
       TreeNode temp = root.left;
       root.left  = root.right;
       root.right = temp;

       // invert the left subtree 
       invertTree(root.left);
       invertTree(root.right);




     return root;
    }
}
