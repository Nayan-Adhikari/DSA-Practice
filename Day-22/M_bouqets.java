import java.util.*;
class Solution {
    public boolean possible(int[] bloomDay,int day, int k, int m){
        int n= bloomDay.length;
        int count = 0;
        int noOfB= 0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=day){
                count++;
            }else{
                noOfB += count/k;
                count = 0;
            }
        }
        noOfB += count/k;
        return noOfB>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long)m*k;
        int n = bloomDay.length;
        if(val > n){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)        {
            min = Math.min(min,bloomDay[i]);
            max = Math.max(max,bloomDay[i]);
        }
        int low = min;
        int high = max;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(possible(bloomDay,mid,k,m)){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}