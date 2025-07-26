class Solution {
    public boolean isPossible(int maxQ, int n, int[] arr)
    {
        int store = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%maxQ == 0) store += arr[i]/maxQ;
            else store += arr[i]/maxQ+1;
        }
        if(store > n) return false;
        else return true;

    }
    public int minimizedMaximum(int n, int[] arr) {
        int m = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            mx = Math.max(mx,arr[i]);
        }

        int lo = 1;
        int hi = mx;
        int maxAns = 0;

        while(lo <= hi)
        {
            int mid = lo + (hi-lo)/2;
            if(isPossible(mid, n, arr ) == true) {
                maxAns = mid;
                hi = mid-1;
            }
            else lo = mid+1;

        }
        return maxAns;
        
    }
}