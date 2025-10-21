class Solution {
    public int compress(char[] chars) {
        int n = chars.length;

        int index = 0;
        int i = 0;

        while(i < n)
        {
            char curr_char = chars[i];
            int count = 0;

          // find count of duplicates
            while(i<n && chars[i] == curr_char)
            {
                count++;
                i++;
            }

            // Now do the assigning work
            chars[index] = curr_char;
            index++;

            if(count > 1)
            {
                String count_str = Integer.toString(count);
                for(char ele : count_str.toCharArray())
                {
                    chars[index] = ele;
                    index++;
                }
            }
            }
            return index;

        }       
    
}