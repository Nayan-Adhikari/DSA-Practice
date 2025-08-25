class Solution {
    public int maxElement(int[]piles){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        return max;
    }
    public int calculateHour(int[] piles, int k){
        int n = piles.length;
        int totalHour = 0;
        for(int i=0;i<n;i++){
            totalHour += Math.ceil((double)piles[i]/(double)k);
        }
        return totalHour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxi = maxElement(piles);
        int lb = 1;
        int ub = maxi;
        while(lb<=ub){
            int mid = lb + (ub-lb)/2;
            int totalHour = calculateHour(piles,mid);
            if(totalHour<=h){
                ub = mid -1;
            }
            else{
                lb = mid+1;
            }
        }
        return lb;

    }
}