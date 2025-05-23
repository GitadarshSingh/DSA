class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        
        int count = 1;
        int minRow = 0 , maxRow = n-1;
        int minColumn = 0 , maxColumn = n-1;

        while(minRow <= maxRow && minColumn <= maxColumn)
        {
            for(int j = minColumn ; j <= maxColumn ; j++)
            {
                ans[minRow][j] = count++;
             
            }
            minRow++;
            for(int i = minRow; i<= maxRow; i++)
            {
                ans[i][maxColumn] = count++;
               
            }
            maxColumn--;

            if (minRow <= maxRow) {
            for(int j = maxColumn ; j >= minColumn ; j--)
            {
                ans[maxRow][j] = count++;
                
            }
            maxRow--;
            }

            if (minColumn <= maxColumn) {
            for(int i = maxRow; i>= minRow; i--)
            {
                ans[i][minColumn] = count++;
            }
            minColumn++;
            }
            
        }

return ans;
        
    }
}