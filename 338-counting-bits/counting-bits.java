class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        if(n==0) return ans;

        ans[0] = 0;
        for(int i=1;i<n+1;i++)
        {
            if(i%2 != 0)
            {
                ans[i] = ans[i/2] + 1;
            }else {
                ans[i] = ans[i/2];
            }
        }
        return ans ;


        
    }
}