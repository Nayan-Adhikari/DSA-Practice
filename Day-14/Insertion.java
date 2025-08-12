public class Insertion {
    static void InsertionAtBeginning(int arr[],int noOfElement, int value){
        if(noOfElement == arr.length){
            System.out.println("Array is full");
            return;
        }
        for(int i=noOfElement;i>0;i--){
            arr[i] = arr[i-1];
        }
        noOfElement++;
        arr[0] = value;
    }

    static void InsertionAtEnd(int arr[], int noOfElement, int value){
        if(noOfElement == arr.length){
            System.out.println("Array is full");
            return;
        }
        arr[noOfElement] = value;
        noOfElement++;
    }

    static void InsertionAtIndex(int arr[],int noOfElement,int value,int index){
        if(noOfElement == arr.length){
            System.out.println("Array is full");
            return;
        }
        for(int i=noOfElement;i>=index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        noOfElement++;
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
        InsertionAtBeginning(arr,n,0);
        n++;
        PrintArray(arr,n);
        InsertionAtEnd(arr, n, 60);
        n++;
        PrintArray(arr, n);
        InsertionAtIndex(arr, n, 35, 4);
        n++;
        PrintArray(arr, n);
    }
}
