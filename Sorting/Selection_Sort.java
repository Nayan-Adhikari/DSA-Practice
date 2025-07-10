 public int[] sortArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[mini] > arr[j]) {
                    mini = j;
                }
            }
            // Swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }