class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>preorder=new ArrayList<>();
        if(root==null)return preorder;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(st.size()>0){
            TreeNode node=st.pop();
            preorder.add(node.val);
            if(node.right!=null)st.push(node.right);
            if(node.left!=null)st.push(node.left);
        }return preorder;
    }
}