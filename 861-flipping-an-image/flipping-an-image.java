class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int n = arr.length;

        for(int i=0; i<n;i++)
        {
            int left = 0;
            int right = n-1;

            while(left <= right){
                int temp = arr[i][right];
                arr[i][right] = arr[i][left];
                arr[i][left] = temp;

                left++;
                right--;
            }
        }

        //Invert
        for(int i=0; i<n; i++){
            for(int j=0 ;j<n;j++){
                if(arr[i][j]==0) arr[i][j] = 1;
                else arr[i][j] = 0;
            }
        }
        return arr;
    }
}