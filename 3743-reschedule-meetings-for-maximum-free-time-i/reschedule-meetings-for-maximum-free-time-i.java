class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        long[] durations = new long[n];
        for (int i = 0; i < n; i++) {
            durations[i] = (long) endTime[i] - startTime[i];
        }

        long[] prefixDur = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixDur[i + 1] = prefixDur[i] + durations[i];
        }

        // Insert artificial boundaries for convenience
        long[] starts = new long[n + 2];
        long[] ends = new long[n + 2];

        starts[0] = 0;
        ends[0] = 0;
        for (int i = 0; i < n; i++) {
            starts[i + 1] = startTime[i];
            ends[i + 1] = endTime[i];
        }
        starts[n + 1] = eventTime;
        ends[n + 1] = eventTime;

        int maxFree = 0;
        int left = 0;

        // Sliding window over meetings index [left, right]
        // This window represents meetings we potentially reschedule
        for (int right = 0; right <= n; right++) {
            while (left <= right) {
                // Calculate free gap if we reschedule meetings in [left+1, right]
                // Meetings outside [left+1, right] remain fixed
                // free gap = starts[right + 1] - ends[left] - sum durations [left+1..right]
                long gap = starts[right + 1] - ends[left] - (prefixDur[right] - prefixDur[left]);
                int reschedules = right - left; // number of meetings moved

                if (gap >= 0 && reschedules <= k) {
                    maxFree = (int) Math.max(maxFree, gap);
                    break; // valid window found; try expanding right
                } else {
                    left++; // shrink window from left
                }
            }
        }

        return maxFree;
    }
}