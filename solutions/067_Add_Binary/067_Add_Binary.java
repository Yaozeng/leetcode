// Given two binary strings, return their sum (also a binary string).
//
// The input strings are both non-empty and contains only characters 1 or 0.
//
// Example 1:
//
//
// Input: a = "11", b = "1"
// Output: "100"
//
// Example 2:
//
//
// Input: a = "1010", b = "1011"
// Output: "10101"
//


class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuffer res=new StringBuffer();
        while(i>=0||j>=0){
            int num1=(i>=0)?charToInt(a.charAt(i)):0;
            int num2=(j>=0)?charToInt(b.charAt(j)):0;
            int sum=num1+num2+carry;
            carry=(sum>1)?1:0;
            if(carry>0){
                res.append(sum-2);
            }else{
                res.append(sum);
            }           
            i--;
            j--;
        }
        if(carry==1){
            res.append(1);
        }
        return res.reverse().toString();
    }
    public int charToInt(char a){
        if(a=='1') return 1;
        return 0;
    }
}
