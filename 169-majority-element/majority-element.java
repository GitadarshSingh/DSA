class Solution {
    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int mid = nums[nums.length/2];
        // return mid;

        for (int i = 1; i < nums.length ; i++) {
            for (int j = i; j >= 1; j--) {
           if(nums[j] < nums[j-1]){
               swap(nums, j , j-1);
           }else break;

            }
        }
        return nums[nums.length/2];
        
    }
}