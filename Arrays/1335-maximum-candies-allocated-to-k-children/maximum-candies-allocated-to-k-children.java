class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left=1;
        int right=0;
        int ans=0;
        for(int i=0;i<candies.length;i++){
            right=Math.max(right,candies[i]);
        }
        while(left<=right){
            int mid=left+(right-left)/2;

            if(canDistribute(candies,k,mid)){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
    public boolean canDistribute(int[] candies,long k,int mid){
        long noOfChildren=0;
        for(int i=0;i<candies.length;i++){
            noOfChildren+=candies[i]/mid;
        }
        if(noOfChildren>=k){
            return true;
        }
        return false;
    }
}