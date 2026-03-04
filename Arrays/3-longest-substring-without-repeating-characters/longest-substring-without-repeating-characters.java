class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int maxLen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                l=Math.max(l,map.getOrDefault(s.charAt(r),0)+1);
            }

            map.put(s.charAt(r),r);
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}