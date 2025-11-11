package Lecture4;

public class PathSumII {
	/*
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        solve(root,targetSum,list,ans);
        return ans;
        
    }
    public void solve(TreeNode root, int target,List<Integer>list,List<List<Integer>> ans){

        if(root==null){
            return ;
        }
        list.add(root.val);
        if(root.left==null && root.right==null && root.val==target){
            List<Integer>ll= new ArrayList<>(list);
            ans.add(ll);
        }

        solve(root.left,target-root.val,list,ans);
        solve(root.right,target-root.val,list,ans);
        list.remove(list.size()-1);

    }
    */
}
