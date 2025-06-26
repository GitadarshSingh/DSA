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
    public int minDepth(TreeNode root) {
      return height(root);
    }
    public int height(TreeNode node)
    {
        if(node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        if (left == 0 || right == 0) {
            return 1 + (left == 0 ? right : left);
        } else {
            return 1 + Math.min(left, right);
        }
    }

}