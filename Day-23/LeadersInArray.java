class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> leader = new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[j]>arr[i]){
                    count++;
                    break;
                }
            }
            if(count==0){
                leader.add(arr[i]);
            }
        }
        return leader;
    }
}
