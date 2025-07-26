import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int val : nums){
            prefixSum += val;

            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}