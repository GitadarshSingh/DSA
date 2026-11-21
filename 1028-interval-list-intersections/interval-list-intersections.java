class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList<>();
        int i=0, j=0;
        int m=firstList.length;
        int n=secondList.length;

        while(i<m && j<n)
        {
            int start1=firstList[i][0];
            int end1=firstList[i][1];
            //-------------------------
            int start2=secondList[j][0];
            int end2=secondList[j][1];

            // Case1: Is intersation exist
            if(start1<=start2)
            {
                if(end1>=start2)
                {
                  // Find intersection 
                  int s = Math.max(start1,start2);
                  int e = Math.min(end1,end2);
                  result.add(new int[]{s,e});
                }
                
            }
            else {
                if(end2>=start1)
                {
                  // Find intersection 
                  int s = Math.max(start1,start2);
                  int e = Math.min(end1,end2);
                  result.add(new int[]{s,e});
                }
            }

            if(end1<end2) i++;
            else j++;
        }

        return result.toArray(new int[result.size()][]);

        
    }
}