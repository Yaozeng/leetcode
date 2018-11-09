// Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//
// Example 1:
//
//
// Input: 121
// Output: true
//
//
// Example 2:
//
//
// Input: -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//
//
// Example 3:
//
//
// Input: 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//
// Follow up:
//
// Coud you solve it without converting the integer to a string?
//


class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        Integer [] res=helper(x);
        for(int i=0;i<res.length/2;i++){
            if(res[i]!=res[res.length-i-1]){
                return false;
            }
        }
        return true;
    }
    public Integer [] helper(int x){
        List<Integer> list=new ArrayList<>();
        while(x!=0){
            list.add(x%10);
            x/=10;
        }
        Integer [] res=new Integer [list.size()];
        return list.toArray(res);
    }
}
