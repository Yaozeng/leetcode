// Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//
// Example 1:
//
//
// Input: "babad"
// Output: "bab"
// Note: "aba" is also a valid answer.
//
//
// Example 2:
//
//
// Input: "cbbd"
// Output: "bb"
//
//


class Solution {
    public String longestPalindrome(String s) {
        boolean [][] dp=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            dp[i][i]=true;
            if(i<s.length()-1){
                if(s.charAt(i)==s.charAt(i+1)){
                    dp[i][i+1]=true;
                }
            }
        }
        for(int L=3;L<=s.length();L++){
            for(int i=0;i+L-1<s.length();i++){
                int j=i+L-1;
                if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]){
                    dp[i][j]=true;
            }
        }
        }
        int max=0;
        String res="";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(dp[i][j]){
                    if(j-i+1>max){
                        max=j-i+1;
                        res=s.substring(i,j+1);
                    }
                }
            }
        }
        return res;
    }
}
