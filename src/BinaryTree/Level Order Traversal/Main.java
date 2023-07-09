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
