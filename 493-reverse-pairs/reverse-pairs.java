class Solution {
    //global variable
    static int count;
    public  void merged(int[] a, int[] b, int[] merged){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length) {
            if(a[i] < b[j]) merged[k++] = a[i++];
            else merged[k++] = b[j++];
        }
        while(i < a.length) merged[k++] = a[i++];
        while(j < b.length) merged[k++] = b[j++];

    }
    public void inversion(int[] a, int[] b){
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if((long)a[i]> (long)((long)2*(long)b[j])){
                count += (a.length - i);
                j++;
            }
            else  i++;
        }
    }

    public void mergeSort(int[] arr){
        int n = arr.length;
        if(n<=1) return; //base case

        //working
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for(int i=0;i<n/2;i++) a[i] = arr[i];
        for(int i=0;i<n-n/2;i++) b[i] = arr[i+n/2];

        //recursive call
        mergeSort(a);
        mergeSort(b);

        inversion(a,b);

        merged(a,b,arr);

    }

    public int reversePairs(int[] nums) {
        count=0;
        mergeSort(nums);

        return count;
        
    }
}