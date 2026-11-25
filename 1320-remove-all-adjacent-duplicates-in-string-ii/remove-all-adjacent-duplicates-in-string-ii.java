class Solution {
    public static class Pair
    {
        char first;
        int second;

        Pair(char first, int second)
        {
            this.first=first;
            this.second=second;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        //Stack<first,second> st = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(st.isEmpty())
            {
                st.push(new Pair(ch,1));
                continue;
            }
            //Top aur abhi ka character match nhi kar rha 
            if(st.peek().first != ch)
            {
                st.push(new Pair(ch,1));
                continue;
            }
            //Stack empty nhi aur match bhi kr rha 
            if(st.peek().second < (k-1))
            {
                Pair p = st.peek();
                st.pop();

                st.push(new Pair(p.first,p.second+1));
                continue;
            }
            //
            st.pop();

        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            Pair p = st.peek();
            st.pop();

            while(p.second-- > 0)
            {
                sb.append(p.first);
            }
        }
        return sb.reverse().toString();


        
    }
}