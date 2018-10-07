//
// Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//
// Examples:
//
// s = "leetcode"
// return 0.
//
// s = "loveleetcode",
// return 2.
//
//
//
//
// Note: You may assume the string contain only lowercase letters.
//


class Solution {
    public int firstUniqChar(String s) {
        int [] count=new int[65535];
        int i;
        for(i=0;i<s.length();i++){
            count[(int)s.charAt(i)]++;
        }
        for(i=0;i<s.length();i++){
            if(count[(int)s.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}
