class Tree
{   //https://practice.geeksforgeeks.org/problems/k-distance-from-root/1
     // Recursive function to print right view of a binary tree.
     void helper(Node root,int k,ArrayList<Integer>res){
          if(root==null||k<0)return;
          if(k==0)res.add(root.data);
         helper(root.left,k-1,res);
         helper(root.right,k-1,res);
     }
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
          ArrayList<Integer>res=new ArrayList<>();
           helper(root,k,res);
         
          return res;
     }
}
