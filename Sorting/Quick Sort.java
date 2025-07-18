static void swap(int[] arr, int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int partition(int arr[],int l,int r){
        int pivot = arr[r];
        int i = l-1;
        for(int j=l;j<r;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return i+1;
    }
    static int[] quickSort(int arr[],int l,int r){
        if(l<r){
            int pi = partition(arr,l,r);
            quickSort(arr,l,pi-1);
            quickSort(arr,pi+1,r);
        }
        return arr;
    }