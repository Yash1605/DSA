//https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
class Solution {
    static ArrayList<TreeNode> path;
    public static boolean find(TreeNode root,TreeNode target){
        if(root==null)return false;
        if(root.val==target.val){
            path.add(root);
            return true;
        }boolean filc=find(root.left,target);
        if(filc){
            path.add(root);
            return true;
        }
        boolean firc=find(root.right,target);
        if(firc){
            path.add(root);
            return true;
        }
        return false;
    }
    public static void kleveldown(TreeNode root,TreeNode blocker,int k,ArrayList<Integer>res){

if(root==null||k<0||root==blocker)return;
if(k==0){
    res.add(root.val);
    return ;
} kleveldown(root.left,blocker,k-1,res);
  kleveldown(root.right,blocker,k-1,res);



    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        path=new ArrayList<>();
        find(root,target);
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<path.size();i++){
          kleveldown(path.get(i),i==0?null:path.get(i-1) ,k-i,res);
        } return res;
    }
}