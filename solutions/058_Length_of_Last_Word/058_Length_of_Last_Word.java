// Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//
// If the last word does not exist, return 0.
//
// Note: A word is defined as a character sequence consists of non-space characters only.
//
// Example:
//
// Input: "Hello World"
// Output: 5
//
//


class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int last=0;
        for(int i=0;i<s.length();){
            if(s.charAt(i)!=' '){
                count++;
                i++;
            }else{
                last=count;
                count=0;
                i++;
                while(i<s.length()&&s.charAt(i)==' ') i++;
            }
        }
        return count>0?count:last;
    }
}
