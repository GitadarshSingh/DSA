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
    // if(j == n){// now take elemnts form b only
    //        while(i<m)
    //        {
    //            c[k] = a[i];
    //            i++; k++;
    //        }
    //    }

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
         for (int p = 0; p < m + n; p++) {
            a[p] = c[p];
        
    }
    }
    
}