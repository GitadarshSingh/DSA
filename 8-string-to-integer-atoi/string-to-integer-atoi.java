class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;

        // skip spaces
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;

        // sign
        int sign = 1;
        char c = s.charAt(i);
        if (c == '-' || c == '+') {
            sign = (c == '-') ? -1 : 1;
            i++;
        }

        int result = 0;
        int limit = Integer.MAX_VALUE / 10;

        // parse digits
        while (i < n) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break;
            int digit = ch - '0';

            // overflow check
            if (result > limit || (result == limit && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
