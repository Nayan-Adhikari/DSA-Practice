import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int floor = -1, ceil = -1;

        // Binary search for floor
        int lb = 0, ub = n - 1;
        while (lb <= ub) {
            int mid = lb + (ub - lb) / 2;
            if (a[mid] == x) {
                floor = ceil = a[mid];
                return new int[]{floor, ceil};
            } else if (a[mid] < x) {
                floor = a[mid]; // possible floor
                lb = mid + 1;
            } else {
                ceil = a[mid]; // possible ceil
                ub = mid - 1;
            }
        }
        return new int[]{floor, ceil};
    }
    
}