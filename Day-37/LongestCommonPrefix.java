class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        StringBuilder finall = new StringBuilder();
        for(int i=1;i<strs.length;i++){
            finall.setLength(0);
            int j=0;
            while (j < result.length() && j < strs[i].length() && 
            result.charAt(j) == strs[i].charAt(j)) {
                finall.append(strs[i].charAt(j));
                j++;
            }
            if (result.isEmpty()) return "";
            result = finall.toString();
        }
        return result;
    }
}