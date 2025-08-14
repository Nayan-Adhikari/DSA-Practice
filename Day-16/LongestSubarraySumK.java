// User function Template for Java
import java.util.*;
class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlen = 0;
        int prefixSum = 0;
        for(int i = 0;i<arr.length;i++){
            prefixSum += arr[i];
            
            if(prefixSum==k){
                maxlen = i+1;
            }
            
            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }
            
            if(map.containsKey(prefixSum-k)){
                maxlen = Math.max(maxlen,i - map.get(prefixSum-k));
            }
        }
        return maxlen;
    }
}
