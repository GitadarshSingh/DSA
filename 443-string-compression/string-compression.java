class Solution {
    public int compress(char[] arr) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                ans.append(arr[i]);
                int len = j - i;
                if (len > 1) {
                    ans.append(len);
                }
                i = j;
            }
        }

       
        ans.append(arr[i]);
        int len = j - i;
        if (len > 1) {
            ans.append(len);
        }

        
        for (i = 0; i < ans.length(); i++) {
            arr[i] = ans.charAt(i);
        }

        return ans.length();
    }
}
