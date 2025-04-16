class Solution {
    public void merge(int[] a , int m, int[] b, int n) {
    int[] c = new int[m+n];
    int i = 0 , j = 0 , k = 0;

    while(i<m && j<n)
    {
        if(a[i]<b[j])
        {
            c[k] = a[i];
            i++;
            k++;
        }
        else {
            c[k] = b[j];
            j++;
            k++;
        }
    
    }

     while(i<m)
         {
             c[k] = a[i];
            i++;
             k++;
        }
    

         while(j<n)
         {
             c[k] = b[j];
             j++;
            k++;
         }

         // We are storing all the element of 'c' array in 'a' array because function is void we can't retun 'c',
      int x = 0;
while (x < m + n) {
    a[x] = c[x];
    x++;
}

    


}
    
}