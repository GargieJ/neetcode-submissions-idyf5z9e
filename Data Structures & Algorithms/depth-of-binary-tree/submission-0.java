
class Solution {
    public int max(int a,int b){
        if (a>b){return a;}
        else{return b;}
    }
    public int maxDepth(TreeNode root) {
    if (root==null){return 0;}
    int rightDepth=maxDepth(root.right);
    int leftDepth=maxDepth(root.left);
    return 1+ max(rightDepth,leftDepth);
}
}
