public class Deletion {
    static void DeletionAtBeginning(int[] arr,int n){
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        n--;
    }
    static void DeletionAtIndex(int[] arr, int n,int index){
        for(int i=index+1;i<n;i++){
            arr[i-1] = arr[i];
        }
        n--;
    }
    static void PrintArray(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        int n=5;
        PrintArray(arr, n);
        DeletionAtBeginning(arr, n);
        n--;
        PrintArray(arr, n);
        DeletionAtIndex(arr, n, 2);
        n--;
        PrintArray(arr, n);

    }
}
