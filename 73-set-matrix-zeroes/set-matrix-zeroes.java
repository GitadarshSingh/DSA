class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] helper  = new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                helper[i][j] = arr[i][j];
            }
        }

        // traverse in helper
        for(int i=0;i<m;i++)
        {
            for(int j=0; j<n;j++)
            {
                if(helper[i][j]==0)
                {
                    // fix 0 in row, then only col vary row will fixed.
                    for(int col=0;col<n;col++)
                    {
                        arr[i][col] = 0;
                    }
                    for(int row=0 ;row<m;row++)
                    {
                        arr[row][j]=0;
                    }
                }
            }
        }
    }
}