class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0;
        int maxLen=0;
        int zerosCount=0;
        while(r<nums.length){
            if(nums[r]==0){
                zerosCount++;
            }
            while(zerosCount>k){
                if(nums[l]==0){
                    zerosCount--;
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}