/** https://leetcode.com/problems/minimum-depth-of-binary-tree
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
       //dfs method 
       if(root==null)return 0;
       if(root.left==null&&root.right==null)return 1;
       int l=root.left!=null?minDepth(root.left):Integer.MAX_VALUE;
    
       int r=root.right!=null?minDepth(root.right):Integer.MAX_VALUE;
        return 1+Math.min(l,r);
    }
}
//bfs  method
// class Solution
// {
// 	int minDepth(Node root)
// 	{
// 	    
// 	    Queue<Node>que=new ArrayDeque<>();
// 	    if(root==null)return 0;
// 	    int level =1;
// 	    que.add(root);
// 	    while(que.size()>0){
// 	        int n=que.size();
// 	         while(n-->0){
	        //    Node temp=que.remove();
	        //     if(temp.left==null&&temp.right==null)return level;
	        //     if(temp.left!=null)que.add(temp.left);
            //     if(temp.right!=null)que.add(temp.right);
	        // }level++;
// 	    }return 0;
// 	}
// }