//
// Given a non-empty string s, you may delete at most one character.  Judge whether you can make it a palindrome.
//
//
// Example 1:
//
// Input: "aba"
// Output: True
//
//
//
// Example 2:
//
// Input: "abca"
// Output: True
// Explanation: You could delete the character 'c'.
//
//
//
// Note:
//
// The string will only contain lowercase characters a-z.
// The maximum length of the string is 50000.
//
//


class Solution {
    /*
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return isPalindrome(s.substring(0,j)+s.substring(j+1,s.length()))||isPalindrome(s.substring(0,i)+s.substring(i+1,s.length()));
            }
        }
        return true;                            
    }
    public boolean isPalindrome(String s){
        StringBuffer str=new StringBuffer(s);
        return str.reverse().toString().equals(s);
    }
    */
        public boolean validPalindrome(String s) {
        if (s.length() == 0) return true;
        char[] chArray = s.toCharArray();
        for (int i = 0, j = chArray.length - 1; i <= j; i++, j--)
        {
            if (chArray[i] != chArray[j])
            {
                return isPalindrome(chArray, i, j-1) || isPalindrome(chArray, i+1, j);
            }
        }
        return true;
    }
    
    private boolean isPalindrome(char[] lst, int start, int end)
    {
        for (int i = start, j = end; i <= j; i++, j--)
            if (lst[i] != lst[j]) return false;
        return true;
    }
}
