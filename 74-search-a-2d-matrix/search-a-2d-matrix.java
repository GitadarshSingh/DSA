class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        boolean flag = false;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                if(matrix[i][j]==target) {
                        flag =true;

                }
            }
        }
        return flag;
    }
}