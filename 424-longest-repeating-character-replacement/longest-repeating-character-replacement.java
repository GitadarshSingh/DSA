class Solution {
    private int find(HashMap<Character, Integer> map) {
        int max = 0;
        for (int val : map.values()) {
            max = Math.max(max, val);
        }
        return max;
    }
    public int characterReplacement(String s, int k) {
        int low = 0;
        int res = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int high=0;high<s.length();high++)
        {
            map.put(s.charAt(high), map.getOrDefault(s.charAt(high),0)+1); // Include high

            //2. Jb tk info galat hai low ko shring kro : matlabe low ko badhana hai window ko kam karna hai


            int len = high-low+1;
            int maxCountFreq = find(map
            );
            int diff = len-maxCountFreq;

            while(diff > k)
            {
                map.put(s.charAt(low), map.get(s.charAt(low))-1);
                low++;

                len = high - low + 1;
                maxCountFreq = find(map);
                diff = len - maxCountFreq;

            }
              res = Math.max(res, high - low + 1);

        }
        return res;
        
    }
}