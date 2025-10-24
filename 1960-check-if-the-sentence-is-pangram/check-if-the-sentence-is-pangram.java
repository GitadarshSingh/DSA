class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
       int[] arr = new int[26];

       for(char ch : sentence.toCharArray())
       {
         if(ch >= 'a' && ch <='z')
         {
            int index = ch - 'a';
            arr[index]++;
         }

       }

       for(int count : arr)
       {
        if(count == 0) return false;
       }
        return true;
    }
}