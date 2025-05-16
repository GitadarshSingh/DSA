class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        // Transposing
        for(int i=0;i<n;i++){
            for(int j=0;j<i; j++){
                // swap(arr[i][j]arr[j][i]);
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //Reverser an array 
        for(int i=0 ; i<n;i++){
            int a=0 , b=n-1;
            while(a<=b){
                // swap(arr[i][a],arr[i][b]);
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;

            }
        }
        
    }
}