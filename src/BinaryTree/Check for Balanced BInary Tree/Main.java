//https://leetcode.com/problems/balanced-binary-tree/
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
    static class Pair{
        int height;
        boolean isbalanced;
        Pair(int height,boolean isbalanced){
            this.height=height;
            this.isbalanced=isbalanced;
        }
    }
    public static Pair helper(TreeNode root){
        if(root==null)return new Pair(0,true);
        Pair left=helper(root.left);
        Pair right=helper(root.right);
         boolean nodeisbalanced=false;
         int diff=Math.abs(left.height-right.height);
         if(diff<=1) nodeisbalanced=true;
         if(left.isbalanced==true&&right.isbalanced==true&&nodeisbalanced==true)
         return new Pair(Math.max(left.height,right.height)+1,true);
         else 
         return new Pair(Math.max(left.height,right.height)+1,false);

        
            }
    public boolean isBalanced(TreeNode root) {
        return helper(root).isbalanced;
    }
}
//  naive approach
//  bool check(node)
//  if(node==null)return true;
//  lh=findhleft(node.right);
//  rh=findhright(node.right);
//  if(abs(lh-rh)>1)returnfalse;
//  bool left=check(node.left);
//  bool right=check(node.right);
//  if(!left||!right)return false ;
//  return true;