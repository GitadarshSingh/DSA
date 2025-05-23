class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m = arr.length,  n = arr[0].length;
        List<Integer> ans = new ArrayList<>();

        // Spiral Code
        int minRow = 0 ,  maxRow = m - 1;
        int minColumn = 0 ,  maxColumn = n - 1;
 
        while(minRow <= maxRow && minColumn <= maxColumn)
        {
            //left to right
            for (int j = minColumn; j <= maxColumn; j++) {
                ans.add(arr[minRow][j]);
            }
            minRow++;
            // top to bottom
            if(minRow>maxRow || minColumn >maxColumn) break;
            for (int i = minRow; i <= maxRow; i++) {
                ans.add(arr[i][maxColumn]);
            }
            maxColumn--;

            //right to left
            if(minRow>maxRow || minColumn >maxColumn) break;
            for (int j = maxColumn; j >= minColumn; j--) {
                ans.add(arr[maxRow][j]);
            }
            maxRow--;
            // bottom to top
            if(minRow>maxRow || minColumn >maxColumn) break;
            for (int i = maxRow; i >= minRow; i--) {
                ans.add(arr[i][minColumn]);
            }
            minColumn++;

        }
        return ans;
       }
    
}