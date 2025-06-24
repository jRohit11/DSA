class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        helper(nums,new ArrayList<>(),visited,ans); 
        return ans;
    }
    public void helper(int[] nums,List<Integer> curr,boolean[] visited,List<List<Integer>>ans){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            if(i>0 && nums[i-1]==nums[i] && !visited[i-1]) continue;

            visited[i]=true;
            curr.add(nums[i]);
            helper(nums,curr,visited,ans);
            curr.remove(curr.size()-1);
            visited[i]=false;
        }
    }
}