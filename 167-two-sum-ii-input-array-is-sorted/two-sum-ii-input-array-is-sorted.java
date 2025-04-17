class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        int[] nums = new int[2];
        int n = arr.length;

        int start = 0 , end = n-1;

        while(start < end)
        {
          int sum =  arr[start] + arr[end];
          if(target > sum)
          {
            start++;
          }
          else if(target < sum)
          {
            end--;
          }
          else {
            nums[0] = start+1;
            nums[1] = end+1;

            return nums;
          }
        }
       return nums;
        
    }
}