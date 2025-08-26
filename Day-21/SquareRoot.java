class Solution {
    int floorSqrt(int n) {
        // code here
        int lb = 1;
        int ub = n;
        while(lb<=ub){
            long mid = lb + (ub-lb)/2;
            long val = mid*mid;
            if(val <= (long)(n)){
                lb = (int)mid+1;
            }
            else{
                ub = (int)mid - 1;
            }
        }
        return ub;
    }
}