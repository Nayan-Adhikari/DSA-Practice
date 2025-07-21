class Solution {
    void zeros(int [][]arr, int zeroth_row,int zeroth_column){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==zeroth_row || j==zeroth_column){
                    arr[i][j]=0;
                }
            }
        }
    }

    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] zeroth_row=new int[m*n];
        int[] zeroth_column=new int[m*n];

        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    zeroth_row[k]=i;
                    zeroth_column[k]=j;
                    k++;
                }
            }
        }
        for(int i=0;i<k;i++){
            zeros(matrix,zeroth_row[i],zeroth_column[i]);
        }
    }
}