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
    public int depth(TreeNode root, int x){
       
        if(root == null) return Integer.MIN_VALUE;
        
       
        if(root.val == x) return 0;
        
       
        int left = depth(root.left, x);
        int right = depth(root.right, x);
        
        
        return 1 + Math.max(left, right);
    }
    public TreeNode parent(TreeNode root, int x){
        if(root == null) return null;
        
        
        if(root.left != null && root.left.val == x) return root;
        if(root.right != null && root.right.val == x) return root;
        
      
        TreeNode left = parent(root.left, x);
        
        if(left != null) return left;
        
        return parent(root.right, x);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
      
        return (depth(root, x) == depth(root, y) && parent(root, x) != parent(root, y));
    }
}