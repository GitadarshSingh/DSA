class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] arr = s.toCharArray();
        char[] nums = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(nums);

        for(int i=0;i<arr.length;i++){
            if(arr[i] != nums[i]) return false;
        }
        return true;
    }
}