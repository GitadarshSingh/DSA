class Solution {
    public void invert(TreeNode root)
    {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        //swap
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //recursion
        invert(root.left);
        invert(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
        
    }
}