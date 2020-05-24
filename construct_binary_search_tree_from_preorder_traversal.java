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
    int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder == null || preorder.length == 0){
            return null;
        }
        
        return bstFromPreorderHelper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    TreeNode bstFromPreorderHelper(int[] preorder, int min, int max){
        if(index >= preorder.length){
            return null;
        }
        
        int key = preorder[index];
        TreeNode node = null;
        if(key > min && key < max){
            node = new TreeNode(preorder[index]);
            index++;
            node.left = bstFromPreorderHelper(preorder, min, key);
            node.right = bstFromPreorderHelper(preorder, key, max);
        }
        return node;
    }
}