class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int m = haystack.length();
        int l = m-n;

        for(int i=0;i<=l;i++)
        {
            String x = haystack.substring(i, i+n);
            if(x.equals(needle)){
                return i;
            }
        }
 return -1;
        
    }
}