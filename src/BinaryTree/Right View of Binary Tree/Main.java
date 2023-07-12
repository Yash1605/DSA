//https://leetcode.com/problems/binary-tree-right-side-view/
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>view=new ArrayList<>();
        if(root==null)return view;
        Queue<TreeNode>que=new ArrayDeque<>();
        que.add(root);
        while(que.size()>0){
            int n=que.size();
            int rview=0;
            while(n-->0){
                TreeNode temp=que.remove();
                rview=temp.val;
                if(temp.left!=null)que.add(temp.left);
                if(temp.right!=null)que.add(temp.right);
            }view.add(rview);
        }return view;
    }
}