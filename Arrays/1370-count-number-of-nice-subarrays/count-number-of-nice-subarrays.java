class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    public int atmost(int[] nums,int k){
        int count=0;
        int l=0,r=0;
        int oddCount=0;
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
            count+=r-l+1;
            r++;
        }
        return count;
    }
}