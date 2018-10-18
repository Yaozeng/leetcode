//
// Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
//
//
// Example:
//
// Input: s = "abcdefg", k = 2
// Output: "bacdfeg"
//
//
//
// Restrictions: 
//
//  The string consists of lower English letters only.
//  Length of the given string and k will in the range [1, 10000]
//


class Solution {
    public String reverseStr(String s, int k) {
        StringBuffer stb=new StringBuffer(s);
        if(k==1) return stb.toString();
        if(s.length()<=k) return stb.reverse().toString();
        int length=s.length();
        for(int i=0;i<length;i+=2*k){
            if(i+k>length){
                StringBuffer tmp=new StringBuffer(stb.substring(i,length));
                stb.replace(i,length,tmp.reverse().toString());
            }else{
                StringBuffer tmp=new StringBuffer(stb.substring(i,i+k));
                stb.replace(i,i+k,tmp.reverse().toString());
            }
            
        }
        return stb.toString();
    }
}
