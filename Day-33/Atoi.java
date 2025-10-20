class Solution {
    static int helper(String s, int i, long num, int sign){
        int maxi = Integer.MAX_VALUE;
        int mini = Integer.MIN_VALUE;
        
        if(i>=s.length()||!Character.isDigit(s.charAt(i))){
            return (int)(sign*num);
        }
        num = num*10 + (s.charAt(i)-'0');
        if (sign * num <= mini) return mini;
        if (sign * num >= maxi) return maxi;

        return helper(s,i+1,num,sign);
    }
    public int myAtoi(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i) == ' '){
            i++;
        }
        int sign = 1;
        if(i<s.length() && (s.charAt(i) == '+'||s.charAt(i) == '-')){
            sign = (s.charAt(i)=='-') ? -1 : 1;
            i++;
        }
        return helper(s,i,0,sign);
    }
}