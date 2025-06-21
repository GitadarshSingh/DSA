import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // Sort greed factors
        Arrays.sort(s); // Sort cookie sizes

        int totalSatisfiedChildren = 0;
        int i = 0, j = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                totalSatisfiedChildren++;
                i++; // Move to next child
            }
            j++; // Always move to next cookie
        }

        return totalSatisfiedChildren;
    }
}
