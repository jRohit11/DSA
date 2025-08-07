class Solution {
    public int myAtoi(String s) {
        int ans=0;
        char sign='+';
        s=s.trim();
        int i=0;
        if(s.isEmpty()){
            return 0;
        }
        if(s.charAt(0)=='+' || s.charAt(0)=='-'){
            sign= s.charAt(0);
            i++;
        }
        while(i<s.length()){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int digit= s.charAt(i)-'0';
                if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) 
                {
                    return (sign=='-') ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                ans=ans*10+digit;
                
            }else{
                return (ans==0)?0:(sign=='-')?-ans:ans;
            }
            i++;
        }
        return (sign=='-')?-ans:ans;
    }
}