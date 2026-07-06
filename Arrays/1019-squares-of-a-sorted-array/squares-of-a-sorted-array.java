class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1;
        int index=nums.length-1;
        int[] result=new int[nums.length];
        while(l<=r){
            int lSquare=nums[l]*nums[l];
            int rSquare=nums[r]*nums[r];

            if(lSquare>rSquare){
                result[index]=lSquare;
                l++;
            }else{
                result[index]=rSquare;
                r--;
            }
            index--;
        }
        return result;
    }
}