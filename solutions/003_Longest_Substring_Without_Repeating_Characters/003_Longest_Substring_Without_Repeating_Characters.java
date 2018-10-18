// Given a string, find the length of the longest substring without repeating characters.
//
//
// Example 1:
//
//
// Input: "abcabcbb"
// Output: 3 
// Explanation: The answer is "abc", with the length of 3. 
//
//
//
// Example 2:
//
//
// Input: "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
//
//
//
// Example 3:
//
//
// Input: "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3. 
//              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
//
//
//


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(in(i,j,s,s.charAt(j))){
                    break;
                }else{
                    count++;
                }
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
    public boolean in(int i,int j,String s,char obj){
        for(int tmp=i;tmp<j;tmp++){
            if(s.charAt(tmp)==obj){
                return true;
            }
        }
        return false;
    }
}
