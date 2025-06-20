class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(k,n,1,0,new ArrayList<>(),ans);
        return ans;
    }
    public void helper(int k,int n,int start,int sum,List<Integer> current,List<List<Integer>> ans){
        if(current.size()==k ){
            if(sum==n){
                ans.add(new ArrayList<>(current));
            }
            return;
        }
        for(int i=start;i<=9;i++){
            if (sum + i > n) break; // pruning
            current.add(i);
            helper(k,n,i+1,sum+i,current,ans);
            current.remove(current.size()-1);
        }
    }
}