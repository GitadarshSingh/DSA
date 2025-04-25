class Solution {
    public int removeDuplicates(int[] arr) {
        
        int n = arr.length;

        int start = 1;

        for(int i = 1;i<n ;i++)
        {
         if(arr[i] != arr[start-1]){
            arr[start] = arr[i];
            start++;
         }
        }
        return start;
    }
}