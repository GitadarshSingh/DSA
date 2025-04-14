class Solution {
    public void swap(int[] arr , int mid ,int low ){
    int temp = arr[mid];
    arr[mid] = arr[low];
    arr[low] = temp;
    }
    public void sortColors(int[] arr) {
      //Dutch Algorithm
        int n = arr.length;
        int low = 0, mid = 0,  high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                 mid++;
                }

            else if (arr[mid]== 1) mid++;

            else  if(arr[mid] == 2){ // arr[mid] == 2
                    swap(arr,mid,high);
                    high--;
                }

        }
  
    
    }
}