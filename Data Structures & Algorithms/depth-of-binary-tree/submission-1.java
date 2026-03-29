
class Solution {
    
    public int maxDepth(TreeNode root) {
    if (root==null){return 0;}
    int rightDepth=maxDepth(root.right);
    int leftDepth=maxDepth(root.left);
    return 1+ Math.max(rightDepth,leftDepth);
}
}
