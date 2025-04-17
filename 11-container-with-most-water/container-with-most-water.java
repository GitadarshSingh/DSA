class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0, end = n-1;

        int ans = 0;;

        while(start<end)
        {
            int h = Math.min(height[start], height[end]);
            int w = end - start ;

            int area = h*w;
            if(area > ans)
            {
                ans = area ; 
            }
            if(height[start]<height[end])
            {
                start++;
            }
            else {
                end--;
            }


        }
return ans ;
        
    }
}