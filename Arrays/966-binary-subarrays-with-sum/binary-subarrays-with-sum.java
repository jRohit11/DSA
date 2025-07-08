class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal)-atmost(nums,goal-1);
    }
    public int atmost(int[] nums,int goal){
        int l=0,r=0;
        int sum=0;
        int count=0;
        while(r<nums.length){
            if(goal<0){
                return 0;
            }
            sum+=nums[r];
            while(sum>goal ){
                sum-=nums[l];
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}