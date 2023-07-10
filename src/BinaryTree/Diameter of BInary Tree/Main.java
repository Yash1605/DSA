//https://leetcode.com/problems/diameter-of-binary-tree/
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
    static class Pair {
        int dia;
        int height;
        Pair(int dia,int height){
            this.dia=dia;
            this.height=height;
        }
    }
    public static Pair helper(TreeNode root){
        if(root==null)return new Pair(0,0);
        Pair left=helper(root.left);
        Pair right=helper(root.right);
        int diafromroot=left.height+right.height;
        int treedia=Math.max(left.dia,Math.max(diafromroot,right.dia));
        int treeheight=Math.max(left.height,right.height)+1;
        return new Pair(treedia,treeheight);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root).dia;
    }
}