class Solution {
public:
    int maxArea(vector<int>& height) {
    int n = height.size();
        int start = 0, end = n-1;

        int ans = 0;;

        while(start<end)
        {
            int h = min(height[start], height[end]);
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
};