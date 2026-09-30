class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int maxFreq=0;
        int ans=0;
        int l=0,r=0;
        int flip=0;
        while(r<s.length()){
            freq[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(r)-'A']);
            flip=(r-l+1)-maxFreq;
            if((r-l+1)-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                l++;
                flip=(r-l+1)-maxFreq;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}