class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int[] nums,int k){
        int oddCount=0;
        int l=0,r=0;
        int ans=0;
        while(r<nums.length){
            if(nums[r]%2!=0){
                oddCount++;
            }
            while(oddCount>k){
                if(nums[l]%2!=0){
                    oddCount--;
                }
                l++;
            }
            ans+=r-l+1;
            r++;
        }
        return ans;
    }
}