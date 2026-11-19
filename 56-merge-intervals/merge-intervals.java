class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums,(a,b) -> Integer.compare(a[0],b[0]));

        int idx=0;
        
        int start1 = nums[0][0];
        int end1 = nums[0][1];


        for(int i=1;i<nums.length;i++)
        {
            int start2 = nums[i][0];
            int end2 = nums[i][1];

            if(end1 >= start2)
            {
                end1 = Math.max(end1,end2);
                continue;
            }
            nums[idx][0]=start1;
            nums[idx][1]=end1;
            idx++;

            start1= start2;
            end1 = end2;
        }

        nums[idx][0]=start1;
        nums[idx][1]=end1;
        idx++;
        

        return Arrays.copyOfRange(nums, 0, idx);
    }
}