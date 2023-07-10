//https://leetcode.com/problems/binary-tree-maximum-path-sum/
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
    public int maxPathSum(TreeNode root) {
        int[]maxvalue= new int[1];
        maxvalue[0]=Integer.MIN_VALUE;
        helper(root,maxvalue);
        return maxvalue[0]; 
    }
    public int helper(TreeNode root,int[] maxvalue){
        if(root==null)return 0;
        int leftsum=Math.max(0,helper(root.left,maxvalue));
        int rightsum=Math.max(0,helper(root.right,maxvalue));
        maxvalue[0]=Math.max(maxvalue[0],(leftsum+rightsum+root.val));
        return Math.max(leftsum,rightsum)+root.val;
    }
    
}
// for every node try to have curved path 
//  maximum of val+maxl+maxr of every node is ans
//on every node which is lonfgest path is what we return and use maxi variable to compute the longest path,
// to handle negative sum from left and right subtree we compare it with o and then select the max of it 