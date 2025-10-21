class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                if(count>1){
                    result.append(s.charAt(i));
                }
            }
            else if(s.charAt(i)==')'){
                count--;
                if(count>0){
                    result.append(s.charAt(i));
                }
            }
        }
        return result.toString();
    }
}