class Solution {
    public void moveZeroes(int[] nums) {
    //   ArrayList<Integer> arr = new ArrayList();
    //   int noz = 0;
    //   for(int ele:nums)
    //   {
    //     if(ele!=0) arr.add(ele);
    //     else noz++;
    //   }
    //   for(int i=0;i<noz;i++){
    //     arr.add(0);
    //   }
    //   for(int i=0; i<nums.length;i++)
    //   {
    //     nums[i] = arr.get(i);
    //   }

    int n = nums.length;
    int noz=0;
    for(int ele:nums)
    {
        if(ele == 0) noz++;
    }
    for(int i=0;i<noz;i++)
    {
        for(int j=0;j<n-1-i;j++)
        {
            if(nums[j] == 0){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
    }
    }
}