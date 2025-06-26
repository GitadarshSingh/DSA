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
    int depth = 0;
    public int maxDepth(TreeNode root) {
        height(root);
        return depth;
    }
    public int height(TreeNode node)
    {

        if(node == null) return 0;

        // height 
        int leftheight = height(node.left);
        int rightheight = height(node.right);

        depth = Math.max(depth,1+Math.max(leftheight, rightheight));
        return 1 + Math.max(leftheight,rightheight);
       
    }
}