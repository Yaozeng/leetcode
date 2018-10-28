//
// Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.
//
// Example 1:
//
// Input:
// s = "abpcplea", d = ["ale","apple","monkey","plea"]
//
// Output: 
// "apple"
//
//
//
//
// Example 2:
//
// Input:
// s = "abpcplea", d = ["a","b","c"]
//
// Output: 
// "a"
//
//
//
// Note:
//
// All the strings in the input will only contain lower-case letters.
// The size of the dictionary won't exceed 1,000.
// The length of all the strings in the input won't exceed 1,000.
//
//


class Solution {
    public String findLongestWord(String s, List<String> d) {
        String res="";
        String [] s1=new String[d.size()];
        d.toArray(s1);
        Arrays.sort(s1);
        for(int i=0;i<d.size();i++){
            if(isIn(s,s1[i])){
                if(s1[i].length()>res.length()){
                    res=s1[i];
                }
            }
        }
        return res;
    }
    public boolean isIn(String s1,String s2){
        int i=0;
        int j=0;
        for(;i<s1.length()&&j<s2.length();){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j==s2.length();
    }
}
