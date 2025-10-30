class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        StringBuilder result = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            result.append(result.charAt(0));
            result.delete(0,1);
            if(result.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}