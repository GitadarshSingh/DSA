class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1) return s;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<numRows;i++)
        {
            int idx = i;
            int deltaBelow = 2*(numRows - i- 1);
            int deltaUp = 2 * i;

            boolean goingSouth = true;

            while(idx < s.length())
            {
                sb.append(s.charAt(idx));

                if(i==0)
                {
                    idx = idx+deltaBelow;
                }
                else if(i==numRows-1)
                {
                    idx = idx+deltaUp;
                }
                else if(goingSouth == true) 
                {
                    idx = idx+deltaBelow;
                }
                else {
                    idx = idx+deltaUp;
                }
                goingSouth = !goingSouth;
            }


        }

        return sb.toString();
    }
}