class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while(i>=0 || j>=0 || carry > 0)
        {
            int d1;
            if(i>=0 ){
                char c = num1.charAt(i);
                // This below line will convert string charater into number
                 d1 = c - '0';
            } else {
                d1 = 0;
            }

            int d2;
            if(j>=0){
                char c = num2.charAt(j);
                d2 = c-'0';
            }else {
                d2 = 0;
            }

            int sum = d1 + d2 + carry;
            int a = sum%10;
            ans.append(a);
            carry = sum/10;
            i--; j--;
        }
        ans.reverse();
        return ans.toString();
        
    }
}