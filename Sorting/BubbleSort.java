public class BubbleSort {
    public int[] sortArray(int arr[]) {
        int n = arr.length;
        int flag;
        for (int i = 0; i < n; i++) {
            flag = 0;
            for (int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag++;
                }
            }
            if(flag == 0){
                    break;
            }
        }
        return arr;
    }
}
