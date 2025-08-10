class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int l=0,r=n-1;
        int sum=0;
        while(l<k){
            sum+=cardPoints[l];
            l++;
        }
        int maxP=sum;
        l=k-1;
        while(l>=0){
            sum-=cardPoints[l];
            sum+=cardPoints[r];
            maxP=Math.max(maxP,sum);
            l--;
            r--;
        }
        return maxP;
    }
}