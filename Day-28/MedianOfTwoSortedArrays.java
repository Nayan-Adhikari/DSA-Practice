class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int arr[] = new int[n1+n2];

        int i=0;
        int j=0;
        int k=0;

        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                k++;
                i++;
            }
            else{
                arr[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = nums2[j];
            j++;
            k++;
        }

        int total = n1 + n2;
        int mid = total / 2;
        if (total % 2 != 0) {
            return arr[mid];
        }
        return ((double) arr[mid - 1] + arr[mid]) / 2.0;
    }
}