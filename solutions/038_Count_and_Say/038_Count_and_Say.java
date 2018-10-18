// The count-and-say sequence is the sequence of integers with the first five terms as following:
//
//
// 1.     1
// 2.     11
// 3.     21
// 4.     1211
// 5.     111221
//
//
// 1 is read off as "one 1" or 11.
// 11 is read off as "two 1s" or 21.
// 21 is read off as "one 2, then one 1" or 1211.
//
// Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
//
// Note: Each term of the sequence of integers will be represented as a string.
//
//  
//
// Example 1:
//
//
// Input: 1
// Output: "1"
//
//
// Example 2:
//
//
// Input: 4
// Output: "1211"
//


class Solution {
    public String countAndSay(int n) {
            String s="1";
    for(int i=1;i<n;i++){
        StringBuilder sb=new StringBuilder();
        int count=1;
        char say=s.charAt(0);
        for(int j=1;j<s.length();j++){
            if(s.charAt(j)!=say){
                sb.append(count).append(say);
                say=s.charAt(j);
                count=1;
            }else{
                count++;
            }
        }
        sb.append(count).append(say);
        s=sb.toString();
    }
    return s;
    }
}
