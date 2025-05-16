class Solution {
    public boolean canArrange(int[] arr, int k) {
        int map[] = new int[k];
        for(int element : arr){ // n
            int rem = ((element % k)+k) % k;
            map[rem]++;
        }
        if(map[0] %2 != 0){ // k/2
            return false;
        }
        for(int rem = 1; rem<=k/2; rem++){
            int com = k-rem;
            if(map[rem]!=map[com]){
                return false;
                };
        }
        return true ;
    }
}
// Time Comp : n+k/2;