class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remaining = target - nums[i];

            if(map.containsKey(remaining)){
                int j = map.get(remaining);
                ans[0] = i;
                ans[1] = j;
                break;

            }else map.put(nums[i],i);
            
        }
        return ans;
        
    }
}