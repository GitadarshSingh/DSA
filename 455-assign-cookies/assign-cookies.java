class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int totalSatisfiedChildern = 0;

        int i=0 , j=0;

        while(i<g.length && j<s.length)
        {
            if(s[j] >= g[i]){
                totalSatisfiedChildern++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
return totalSatisfiedChildern;
           

    }
}