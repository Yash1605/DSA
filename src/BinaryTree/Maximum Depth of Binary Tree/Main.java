class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        int lst=maxDepth(root.left);
        int rst=maxDepth(root.right);
        int re=Math.max(lst,rst)+1;
        return re;
    }
}