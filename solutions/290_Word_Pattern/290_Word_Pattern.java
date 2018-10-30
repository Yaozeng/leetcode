// Given a pattern and a string str, find if str follows the same pattern.
//
// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
//
// Example 1:
//
//
// Input: pattern = "abba", str = "dog cat cat dog"
// Output: true
//
// Example 2:
//
//
// Input:pattern = "abba", str = "dog cat cat fish"
// Output: false
//
// Example 3:
//
//
// Input: pattern = "aaaa", str = "dog cat cat dog"
// Output: false
//
// Example 4:
//
//
// Input: pattern = "abba", str = "dog dog dog dog"
// Output: false
//
// Notes:
// You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.


class Solution {
    public boolean wordPattern(String pattern, String str) {
        String [] count=str.split(" ");
        if(pattern.length()!=count.length) return false;
        Map <Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(count[i])){
                    return false;
                }
            }else{
                if(map.containsValue(count[i])){
                    return false;
                }else{
                    map.put(pattern.charAt(i),count[i]);
                }
            }
        }
        return true;
    }
}
