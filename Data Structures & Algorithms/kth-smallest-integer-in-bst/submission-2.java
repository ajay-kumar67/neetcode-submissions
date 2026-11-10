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

// optimized solution 

class Solution {
    int cnt  = 0;
    int ans = -1; 

    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ans;
        
    }
    public void inorder(TreeNode root, int k){
        if(root == null) {
            return ;
        }
        // traverse left sub-tree 
        inorder(root.left, k);

        cnt++; // after processing increment the cnt and compare 
        if(cnt == k) {
            ans = root.val;
            return ;
        }
        // traverse right sub-tree 
        inorder(root.right, k);
    }




}
