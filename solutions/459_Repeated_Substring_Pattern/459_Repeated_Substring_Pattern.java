// Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
//
//  
//
// Example 1:
//
//
// Input: "abab"
// Output: True
// Explanation: It's the substring "ab" twice.
//
//
// Example 2:
//
//
// Input: "aba"
// Output: False
//
//
// Example 3:
//
//
// Input: "abcabcabcabc"
// Output: True
// Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
//
//


class Solution {
    public boolean repeatedSubstringPattern(String s) {
        /*
        int length=s.length();
        for(int i=1;i<=length/2;i++){
            int j;
            for(j=i;j+i<=length;j+=i){
                if(!s.substring(0,i).equals(s.substring(j,j+i))){
                    break;
                }
            }
            if(j==length){
                return true;
            }
        }
        return false;
        */
         int len = s.length();
    int [] next=new int [len+1];
    next[0] = -1;
    int j = 0, k = -1;
    while( j<len )
    {
        if( k==-1 || s.charAt(j)==s.charAt(k) )
            next[++j] = ++k;
        else k = next[k];
    }
    return next[len]!=0&&next[len]%(len-next[len])==0;
    }
}
