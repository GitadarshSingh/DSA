class Solution {
public:
 bool checkVowel(char ch)
    {
       if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' || ch=='I'|| ch=='O' ||ch =='U'){
        return true;
       }
       
       return false;
    }

    string swapCharacters(string &s, int i, int j)
    {
        
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        return s;
    }
    string reverseVowels(string s) {
        int n = s.length();
        int i=0, j=n-1;
        while(i<j)
        {
           if(checkVowel(s[i])==false) i++;
           else if(checkVowel(s[j])==false) j--;
           else{
            s = swapCharacters(s,i,j);
            i++;
            j--;
           }
        }
           return s;
        
    }
};

    
   


