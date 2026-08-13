class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0,right=0;
        int ans=0;
        for(int i=0;i<weights.length;i++){
            left=Math.max(left,weights[i]);
            right+=weights[i];
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(possibleWeight(weights,days,mid)){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
    public boolean possibleWeight(int[] weights,int days,int mid){
        int daysCount=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(sum>mid){
                daysCount++;
                sum=weights[i];
            }
        }
        if(daysCount<=days){
            return true;
        }
        return false;
    }
}