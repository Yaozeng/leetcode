// Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
// Example 1:
//
// Input: "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
//
//
//
// Note:
// In the string, each word is separated by single space and there will not be any extra space in the string.
//


class Solution {
    public String reverseWords(String s) {
        StringBuffer stb=new StringBuffer(s);
        for(int i=0;i<s.length();){
            int j=i;
            while(j<s.length()&&s.charAt(j)!=' ') j++;
            StringBuffer tmp=new StringBuffer(s.substring(i,j));
            stb.replace(i,j,tmp.reverse().toString());
            i=j;
            i++;
        }
        return stb.toString();
    }
}
