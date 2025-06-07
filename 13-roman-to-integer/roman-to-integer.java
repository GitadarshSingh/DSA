class Solution {
    public int romanToInt(String s) {
        int[] map = new int[26];  // Map from 'A' to 'Z'
        map['I' - 'A'] = 1;
        map['V' - 'A'] = 5;
        map['X' - 'A'] = 10;
        map['L' - 'A'] = 50;
        map['C' - 'A'] = 100;
        map['D' - 'A'] = 500;
        map['M' - 'A'] = 1000;

        int result = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            int curr = map[s.charAt(i) - 'A'];
            int next = (i + 1 < n) ? map[s.charAt(i + 1) - 'A'] : 0;

            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        }

        return result;
    }
}
