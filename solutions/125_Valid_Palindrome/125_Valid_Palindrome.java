// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
// Note: For the purpose of this problem, we define empty string as valid palindrome.
//
// Example 1:
//
//
// Input: "A man, a plan, a canal: Panama"
// Output: true
//
//
// Example 2:
//
//
// Input: "race a car"
// Output: false
//
//


class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        s=s.toLowerCase();
        if(s.length()<2){
            return true;
        }
        while(i<=j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            else if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
        
    }
}
