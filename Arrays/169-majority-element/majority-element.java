class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[ans]==nums[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                ans=i;
                count=1;
            }
        }
        return nums[ans];
    }
}