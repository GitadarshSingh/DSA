class Solution {
    
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        boolean inserted = false;

        for(int i=0 ; i<intervals.length; i++)
        {
            if(!inserted && intervals[i][0] >= newInterval[0])
            {
                result.add(newInterval);
                inserted=true;
            }
            result.add(intervals[i]);
        }
         if (!inserted) {                  // newInterval sabse last mein jayega
            result.add(newInterval);
        }
        

        List<int[]> res = new ArrayList<>();
        int n = result.size();
       
        int start1 = result.get(0)[0];
        int end1 = result.get(0)[1];
        
        for (int i = 1; i < n; i++) {
            int start2 = result.get(i)[0];
            int end2 = result.get(i)[1];

            if (end1 >= start2) { // overlap
                end1 = Math.max(end1, end2);
                continue;
            }
            // push
            res.add(new int[]{start1, end1});
            start1 = start2;
            end1 = end2;
        }
        res.add(new int[]{start1, end1});
        return res.toArray(new int[res.size()][]);
    }
}