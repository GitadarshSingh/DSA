class Solution {
    public int[] sortedSquares(int[] arr)
    {
        int n = arr.length;
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();

        

        for(int i=0;i<n;i++){
            if(arr[i]<0) neg.add(arr[i]);
            else pos.add(arr[i]);
        }

        // No negative ele
        
            for(int i=0;i<pos.size();i++){
                pos.set(i,pos.get(i)*pos.get(i));
            }
            //no pos ele
            for(int i=0;i<neg.size();i++){
            neg.set(i,neg.get(i)*neg.get(i));  
            }
        
            int a=0;
            int p = neg.size()-1;
            while(a<p)
            {
            int temp= neg.get(a);
            neg.set(a,neg.get(p));
            neg.set(p,temp);

            a++;
            p--;

            }
        
        int[] res = new int[neg.size()+pos.size()];
        //Merge both the arry
        int i=0;
        int j=0;

        int idx=0;

        while(i<neg.size() && j<pos.size())
        {
            if(neg.get(i)<=pos.get(j)){
                res[idx] = neg.get(i);
                i++;
                idx++;

            }
            else {
                res[idx]=pos.get(j);
                j++;
                idx++;
            }
        }

        while(i<neg.size()){
            res[idx] = neg.get(i);
            i++;
            idx++;
        }
        while(j<pos.size()){
            res[idx]=pos.get(j);
            j++;
            idx++;
        }

        return res;
       

    }
}