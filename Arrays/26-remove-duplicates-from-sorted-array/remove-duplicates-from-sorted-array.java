class Solution {
    public int removeDuplicates(int[] nums) {
        int prev=0;
        int unique=1;
        int i=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                i++;
                continue;
            }else{
                prev++;
                nums[prev]=nums[i];
                unique++;
                i++;
            }
        }
        return unique;
    }
}