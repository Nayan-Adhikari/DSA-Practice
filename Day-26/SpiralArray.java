class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return arr;

        int m = matrix.length;     // row count
        int n = matrix[0].length;  // column count
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int j = left; j <= right; j++) {
                arr.add(matrix[top][j]);
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                arr.add(matrix[i][right]);
            }
            right--;

            // Traverse bottom row (if still valid)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    arr.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Traverse left column (if still valid)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }

        return arr;
    }
}