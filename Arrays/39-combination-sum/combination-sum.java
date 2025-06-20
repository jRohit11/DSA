class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(candidates,target,0,0,new ArrayList<>(),ans);
        return ans;
    }
    public void helper(int[] candidates,int target,int start,int sum,List<Integer> current,List<List<Integer>> ans){

        if(sum==target){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=start;i<candidates.length;i++){
           
            current.add(candidates[i]);
            helper(candidates,target,i,sum+candidates[i],current,ans);
            current.remove(current.size()-1);
        }
    }
}