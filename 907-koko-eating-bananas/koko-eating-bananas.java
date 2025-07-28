class Solution {
    public boolean isPossible(int[] arr, int mid, int h) {
        int actualHours = 0;
        for (int ele : arr) {
            // Correct and clean ceil logic
            actualHours += (ele + mid - 1) / mid;
        }
        return actualHours <= h;
    }

    public int minEatingSpeed(int[] arr, int h) {
        int mx = Integer.MIN_VALUE;
        for (int ele : arr) {
            mx = Math.max(mx, ele);
        }

        int lo = 1, hi = mx;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(arr, mid, h)) {
                hi = mid; // try to minimize
            } else {
                lo = mid + 1; // need more speed
            }
        }

        return lo; // minimum speed found
    }
}
