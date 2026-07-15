class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct=nums[0];
        int minProduct=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int temp=Math.max(curr,Math.max(curr*maxProduct,curr*minProduct));
            minProduct=Math.min(curr,Math.min(curr*maxProduct,curr*minProduct));
            maxProduct=temp;

            result=Math.max(result,maxProduct);
        }
        return result;
    }
}