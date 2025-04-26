class Solution {
    public int jump(int[] nums) {
        int lastindexOfJump = 0;
        int jump = 0;
        int max = 0;
       
        for(int i=0; i<nums.length-1; i++){
            
            max = Math.max(max, i+nums[i]);

              if (i == lastindexOfJump){
                  jump++;
                 lastindexOfJump = max;
               }
            
        }
 return jump;
    }
}