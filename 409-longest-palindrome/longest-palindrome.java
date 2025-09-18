class Solution {
    public int longestPalindrome(String s) {
        // Count frequency of each character
        int[] freq = new int[128]; // ASCII
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int length = 0;
        boolean oddFound = false;

        for (int count : freq) {
            // Use all even occurrences
            length += (count / 2) * 2;
            // If there's an odd count, one character can sit in the center
            if (count % 2 == 1) {
                oddFound = true;
            }
        }

        // Add one center character if any odd count exists
        if (oddFound) length += 1;

        return length;
    }
}
