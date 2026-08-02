class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){

            int rSum=totalSum-sum-nums[i];
            if(sum==rSum){
                return i;
            }
            sum+=nums[i];
        }
        return -1;
    }
}