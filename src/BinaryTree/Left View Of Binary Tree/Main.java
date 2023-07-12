//https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1?page=1&category[]=Tree&sortBy=submissions
class Tree
{   void printLeft(Node root,ArrayList<Integer>res,int level){
    if(root==null)return ;
    if(res.size()==level)res.add(root.data);
    printLeft(root.left,res,level+1);
    printLeft(root.right,res,level+1);
}
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer>res=new ArrayList<>();
       printLeft(root,res,0);
       return res;
    }
}  //dfs 