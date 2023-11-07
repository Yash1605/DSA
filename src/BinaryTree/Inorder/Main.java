class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
     ArrayList<Integer>inorder=new ArrayList<>();
     if(root==null)return inorder;
     Stack<TreeNode>st=new Stack<>();
     TreeNode node=root;
     while(true){
         if(node!=null){
             st.push(node);
             node=node.left;
         }else {
             if(st.isEmpty())break;
             node=st.pop();
             inorder.add(node.val);
             node=node.right;
         }
     }   return inorder;
    }
}
// recursive solution post and pre is similar as below
// class Solution {
// 	// TC: O(N), SC: O(H)
// 	public static void inorderTraversal(Node root) {
// 		if (root == null) {
// 			return;
// 		}

// 		// explore left subtree
// 		inorderTraversal(root.left);

// 		// print yourself
// 		System.out.print(root.data + " ");
        
//         // explore right subtree
// 		inorderTraversal(root.right);
// 	}
// }
// class Solution {
// 	static void inorder(Node root){
// 		if(root==null)
// 		   return;
// 		inorder(root.left);
// 		res.add(root.data);
// 		inorder(root.right);
// 	}
//      static ArrayList<Integer>res;
//     public ArrayList<Integer> solve(Node root) {
//         // your code here
// 		res=new ArrayList<>();
//        inorder(root);
//     return res;
//     }
// }
/*
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code

        ArrayList<Integer> al = new ArrayList<>();

        if(root==null)
            return al;
        al.addAll(inOrder(root.left));
        //addall  method inserts all of the elements in the specified collection into this list
        al.add(root.data);
        al.addAll(inOrder(root.right));

        return al;
    }
}*/
