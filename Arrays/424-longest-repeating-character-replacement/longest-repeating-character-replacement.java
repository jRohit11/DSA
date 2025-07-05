class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0;
        int maxF=0;
        int maxL=0;
        int changes=0;
        int[] hash=new int[26];
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxF=Math.max(maxF,hash[s.charAt(r)-'A']);
            changes=(r-l+1)-maxF;
            while(changes>k){
                hash[s.charAt(l)-'A']--;
                maxF=Math.max(maxF,hash[s.charAt(l)-'A']);
                l++;
                changes=(r-l+1)-maxF;
            }
            maxL=Math.max(maxL,r-l+1);
            r++;
        }
        return maxL;
    }
}