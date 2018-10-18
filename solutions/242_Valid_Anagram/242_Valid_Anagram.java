// Given two strings s and t , write a function to determine if t is an anagram of s.
//
// Example 1:
//
//
// Input: s = "anagram", t = "nagaram"
// Output: true
//
//
// Example 2:
//
//
// Input: s = "rat", t = "car"
// Output: false
//
//
// Note:
// You may assume the string contains only lowercase alphabets.
//
// Follow up:
// What if the inputs contain unicode characters? How would you adapt your solution to such case?
//


class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int [] counter=new int[26];
        for(int i=0;i<t.length();i++){
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }
        for(int count:counter){
            if(count!=0){
            return false;
            }
        }
        return true;
    }
}
