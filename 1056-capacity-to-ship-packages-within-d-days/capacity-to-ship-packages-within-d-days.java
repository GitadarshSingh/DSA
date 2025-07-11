class Solution {
    public boolean isPossible(int[] arr,int c, int d)
    {
        int n = arr.length;
        int load = 0;
        int daysCompleted = 1;
        for(int i=0;i<n;i++)
        {
            if(load+arr[i] <= c) load += arr[i];
            else{
                load = arr[i];
                daysCompleted++;
            }
        }
        if(daysCompleted <= d)  return true;
        else return false ;
    }
    public int shipWithinDays(int[] arr, int d) {
        int n = arr.length;
        int sum = 0, mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            mx = Math.max(mx,arr[i]);
            sum += arr[i];
        }
        //Binary search
        int lo = mx, hi = sum;
        int minC = 0;

        while(lo<=hi)          // Time Complexity = O(n*log(sum-mx))
        {
            int mid = lo + (hi-lo)/2;
            if(isPossible(arr,mid,d)== true) // O(n)
            {
                 minC = mid;
                 hi = mid-1;
            }
            else lo = mid+1;
        }
    return minC;
        
    }
}