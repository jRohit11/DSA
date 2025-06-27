class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(1,0, k,n,new ArrayList<>(),ans);
        return ans;
    }
    public void helper(int start,int sum,int k,int n,List<Integer> curr,List<List<Integer>> ans){
        if(curr.size()==k && sum==n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<=9;i++){
            if(sum+i>n){
                return;
            }
            curr.add(i);
            helper(i+1,sum+i,k,n,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}