class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
     Queue<Node>que=new ArrayDeque<>();
     que.add(node);
     ArrayList<Integer>res=new ArrayList<>();
     while(que.size()>0){
         
         int count=que.size();
         for(int i=0;i<count;i++){
             node=que.remove();
             res.add(node.data);
             if(node.left!=null)que.add(node.left);
             if(node.right!=null)que.add(node.right);
         }
     }
     
        return res;
    }
}
/**https://leetcode.com/problems/binary-tree-level-order-traversal/
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
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>>res=new ArrayList<>();
//          Queue<TreeNode>que=new ArrayDeque<>();
//          if(root==null)return res;
//          que.add(root);
//         while(que.size()>0){
            
//             int n=que.size();
//             List<Integer>level=new ArrayList<>();
//            while(n-->0){
//     TreeNode temp=que.remove();
//     level.add(temp.val); // add the value of the current node to the level list
//     if(temp.left!=null){
//         que.add(temp.left);
//     }
//     if(temp.right!=null){
//         que.add(temp.right);
//     }
// } res.add(level);
//         }
//         return res;
//     }
// }