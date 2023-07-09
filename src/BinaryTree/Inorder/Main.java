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