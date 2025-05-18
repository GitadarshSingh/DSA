class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n = nums.length;
        int maxXOR = 0;
        for(int i=0;i<n;i++){
            for(int j=i; j<n; j++){
            int x = nums[i];
            int y = nums[j];
            if(Math.abs(x-y) <= Math.min(x,y)){
                maxXOR = Math.max (maxXOR,x ^ y);
            }

            }
            
        }
  return maxXOR;
        
    }
}