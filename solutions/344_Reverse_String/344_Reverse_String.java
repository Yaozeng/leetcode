// Write a function that takes a string as input and returns the string reversed.
//
// Example 1:
//
//
//
// Input: "hello"
// Output: "olleh"
//
//
//
// Example 2:
//
//
// Input: "A man, a plan, a canal: Panama"
// Output: "amanaP :lanac a ,nalp a ,nam A"
//
//
//
//


class Solution {
    public String reverseString(String s) {
        StringBuffer newstring=new StringBuffer(s.length());
        for(int i=s.length()-1;i>=0;i--){
            newstring.append(s.charAt(i));
        }
        return newstring.toString();
    }
}
