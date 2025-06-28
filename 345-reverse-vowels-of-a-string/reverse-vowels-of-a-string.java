class Solution {
    public boolean checkVowel(char ch)
    {
       if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' || ch=='I'|| ch=='O' ||ch =='U'){
        return true;
       }
       
       return false;
    }
    public char[] swapCharacters(char[] ca, int i, int j)
    {
        char temp = ca[i];
        ca[i] = ca[j];
        ca[j] = temp;

        return ca;
    }
    public String reverseVowels(String s) {
        int n = s.length();
        int i=0, j=n-1;

        char[] ca = s.toCharArray();
        while(i<j)
        {
           if(checkVowel(s.charAt(i))==false) i++;
           else if(checkVowel(s.charAt(j))==false) j--;
           else{
            ca = swapCharacters(ca,i,j);
            i++;
            j--;
           }
        }
           return String.valueOf(ca);
            
    }
}


