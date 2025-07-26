class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0;
        int zerosCount=0;
        int max=0;
        while(r<nums.length){
            if(nums[r]==0){
                zerosCount++;
            }
            if(zerosCount>k){
                if(nums[l]==0){
                    zerosCount--;
                }
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}