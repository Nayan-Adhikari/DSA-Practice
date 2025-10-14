class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()>(n/3)){
                list.add(e.getKey());
            }
        }
        return list;
    }
}