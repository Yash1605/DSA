class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       ArrayList<Integer>postorder=new ArrayList<>();
       Stack<TreeNode>st=new Stack<>();
       if(root==null)return postorder;
       TreeNode curr=root;
       while(curr!=null||!st.isEmpty()){
           if(curr!=null){
               st.push(curr);
               curr=curr.left;
           }else {
               TreeNode temp=st.peek().right;
               if(temp==null){
                   temp=st.pop();
                   postorder.add(temp.val);
                   while(!st.isEmpty()&&temp==st.peek().right){
                       temp=st.pop();
                       postorder.add(temp.val);
                   }

               }else 
               curr=temp;
           }
       }return postorder;

    }
}//
// one more way of using 1 stack would be,
// in the previous 2 stack video, instead of using 2nd stack we can push into ans. And in the end, we can reverse ans.




//  using one stack we are going untill get null then go to right then go to its left if it is null then go right then in last root
//   postorder using 2 stack 
//  Stack<TreeNode>st1=new Stack<>();
//         Stack<TreeNode>st2=new Stack<>();
//         ArrayList<Integer>postorder=new ArrayList<>();
//         if(root==null)return postorder;
//         st1.push(root);
//         while(!st1.isEmpty()){
//            root=st1.pop();
//            st2.add(root);
//            if(root.left!=null)st1.add(root.left);
//            if(root.right!=null)st1.add(root.right);

//         }
//         while(st2.size()>0)postorder.add(st2.pop().val);
//         return postorder;