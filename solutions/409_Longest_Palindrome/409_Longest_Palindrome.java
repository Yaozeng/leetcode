// Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
//
// This is case sensitive, for example "Aa" is not considered a palindrome here.
//
// Note:
// Assume the length of given string will not exceed 1,010.
//
//
// Example: 
//
// Input:
// "abccccdd"
//
// Output:
// 7
//
// Explanation:
// One longest palindrome that can be built is "dccaccd", whose length is 7.
//
//


class Solution {
    public int longestPalindrome(String s) {
        Map <Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        for(Integer i:map.values()){
            /*
            if(i%2==0){
                count+=i;
            }else{
                if(i>2){
                    if(count1>0){
                        count+=(i/2)*2;
                        count++;
                        count1--;
                    }else{
                        count+=(i/2)*2;
                    }
                }else{
                    if(count1>0){
                        count++;
                        count1--;
                    }
                }
            }
            */
            count+=i/2*2;
            if(count%2==0&&i%2==1){
                count++;
            }
        }
        return count;
    }
}
