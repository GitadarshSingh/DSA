class Solution {
    public void sortColors(int[] arr) {
        //method 1. with two pass solution
         int n = arr.length;
        int noOfZeroes = 0 , noOfOnes = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == 0) noOfZeroes++;
            if(arr[i] == 1 ) noOfOnes++;

        }
        for (int i = 0; i < n; i++)
        {
            if (i < noOfZeroes) arr[i] = 0;
            else if (i<noOfZeroes+noOfOnes) {
                arr[i] = 1;
            }
            else arr[i] = 2;
        }
        for (int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }
}