class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int lo = 1, hi = n - 2; // Start from 1 and end at n-2 to avoid out of bounds
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
            else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
}
