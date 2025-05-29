class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();

        int minRow=0, maxRow = m-1;
        int minCol=0, maxCol = n-1;

        while(minRow <= maxRow && minCol <= maxCol)
        {
            //from left to rigth
            for(int j=minCol; j<=maxCol; j++)
            {
                ans.add(matrix[minRow][j]);
            }
            minRow++;
            // form top to bottom 
            if(minRow > maxRow || minCol > maxCol) break;
            for(int i=minRow; i<=maxRow; i++)
            {
                ans.add(matrix[i][maxCol]);
            }
            maxCol--;

            if(minRow > maxRow || minCol > maxCol) break;
            for(int j=maxCol; j>=minCol; j--)
            {
                ans.add(matrix[maxRow][j]);
            }
            maxRow--;
 
            if(minRow > maxRow || minCol > maxCol) break;
            for(int i=maxRow;i>=minRow; i--)
            {
              ans.add(matrix[i][minCol]);
            }
            minCol++;

        }
        return ans;
    }
}