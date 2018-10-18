// Write a function that takes a string as input and reverse only the vowels of a string.
//
// Example 1:
//
//
// Input: "hello"
// Output: "holle"
//
//
//
// Example 2:
//
//
// Input: "leetcode"
// Output: "leotcede"
//
//
// Note:
// The vowels does not include the letter "y".
//
//  
//


class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuffer stb=new StringBuffer(s);
        List <Character> list=new ArrayList();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
                list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        while(i<j){
            while(i<j&&!list.contains(stb.charAt(i))) i++;
            while(i<j&&!list.contains(stb.charAt(j))) j--;
                    char tmp=stb.charAt(i);
        stb.setCharAt(i,stb.charAt(j));
        stb.setCharAt(j,tmp);
            i++;
            j--;
        }
        return stb.toString();
    }
}
