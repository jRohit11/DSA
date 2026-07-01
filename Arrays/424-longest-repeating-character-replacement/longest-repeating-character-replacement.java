class Solution {
    public int characterReplacement(String s, int k) {

        int l=0,r=0;
        int maxLen=0;
        HashMap<Character,Integer> map =new HashMap<>();
        int maxFreq=0;
        int flip=0;
        while(r<s.length()){
           
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxFreq=Math.max(maxFreq,map.get(s.charAt(r)));
            flip=(r-l+1)-maxFreq;

            while(flip>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                maxFreq=Math.max(maxFreq,map.get(s.charAt(l)));
                l++;
                flip=(r-l+1)-maxFreq;
               
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
            // int maxLen=0;
        // for(int i=0;i<s.length();i++){
        //     HashMap<Character,Integer> map=new HashMap<>();
        //     int maxFreq=0;
        //     for(int j=i;j<s.length();j++){

        //         map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
        //         maxFreq=Math.max(maxFreq,map.get(s.charAt(j)));
        //         int flip=(j-i+1)-maxFreq;

        //         if(flip<=k){
        //             maxLen=Math.max(maxLen,j-i+1);
        //         }else{
        //             break;
        //         }
        //     }
        // }
        // return maxLen;
}