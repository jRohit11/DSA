class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n= cardPoints.length;
        int l=0,  r=n-1;
        int sum=0;
        while(l<k){
            sum+=cardPoints[l];
            l++;
        }
        l=k-1;
        int maxScore=sum;
        while(l>=0){
            sum = sum - cardPoints[l];
            sum = sum + cardPoints[r];
            maxScore = Math.max(maxScore, sum);
            l--;
            r--;
        }
        return maxScore;
    }
}