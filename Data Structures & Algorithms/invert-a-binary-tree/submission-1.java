

class Solution {
    //TreeNode is an already existing predefined class. root is an object for that class.
    public TreeNode invertTree(TreeNode root) {
        if (root==null){return null;}
        
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            //swapping done..1
        
        invertTree(root.left);
        invertTree(root.right);
        //called the func again for each child node.
        return root;
        //returned root because it would be required for recursion of the fucntion
    }
}




