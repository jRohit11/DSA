class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String ans="";
        String start=strs[0];
        String end=strs[strs.length-1];
        for(int i=0;i<Math.min(start.length(),end.length());i++){
            if(start.charAt(i)!=end.charAt(i)){
                return ans;
            }
            ans +=start.charAt(i);
        }
        return ans;
    }
}