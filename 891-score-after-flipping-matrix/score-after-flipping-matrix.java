class Solution {
    public int matrixScore(int[][] arr) {
     int m = arr.length, n = arr[0].length;
        for(int i=0;i<m;i++)
        {
            if(arr[i][0]==0){ //flip means 0--->1 and 1 --->0
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0) arr[i][j]=1;
                else arr[i][j]=0;
            }
            }   
        }
        // flip those column where(no. of 0s > no. of 1s)
        for(int j=1 ;j<n;j++){
              int noOfZeores =0 , noOfOnes = 0;
              for(int i=0;i<m;i++){
                if(arr[i][j]==0) noOfZeores++;
                else noOfOnes++;
              }
              if(noOfZeores > noOfOnes) {
                for(int i=0;i<m;i++){
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j] =0;
                }
              }
        }
        int score = 0;
        int x = 1;
        for(int j=n-1; j>=0 ;j--)
        {
            for(int i=0;i<m;i++){
                score = score + (arr[i][j]*x);
            }
            x = x*2;
        }
        return score;
        
    }
}