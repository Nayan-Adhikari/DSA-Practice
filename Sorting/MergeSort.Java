public void merge(int arr[], int l, int m, int u) {
        int n1 = m - l + 1;
        int n2 = u - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public void split(int arr[], int l, int u) {
        if (l < u) {
            int mid = l + (u - l) / 2;
            split(arr, l, mid);
            split(arr, mid + 1, u);
            merge(arr, l, mid, u);
        }
    }

    public int[] sortArray(int[] arr, int l, int u) {
        split(arr, l, u);
        return arr;
    }