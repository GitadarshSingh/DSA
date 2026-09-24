class Solution
{
    public int countDistinctIntegers(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
            set.add(reverse(nums[i]));

        }
        return set.size();
    }
    public int reverse(int n)
     {
            int reverse = 0;
            while(n!=0)
            {
                int digit = n%10;
                reverse = reverse*10+digit;
                n=n/10;
            }
            return reverse;
    }
}
