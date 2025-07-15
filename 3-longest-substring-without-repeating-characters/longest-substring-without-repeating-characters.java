import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
            while (set.contains(currentChar)) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(currentChar);
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
