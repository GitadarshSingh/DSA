class Solution {
    public int[] twoSum(int[] arr, int x) {
        int[] ans = new int[2];

        for(int i = 0; i< arr.length;i++)
        {
             boolean flag = false ; // Optimization 
                
            for(int j = i+1 ; j<arr.length;j++)
            {
               if(arr[i] + arr[j] == x)
               {
                        ans[0] = i;
                        ans[1] = j;

                        flag = true; //Optimization

                        break;
               }

            }
            if(flag == true) break; //Opimization
        }

        return ans;
    }
}

