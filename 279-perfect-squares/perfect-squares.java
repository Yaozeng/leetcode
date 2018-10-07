// Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
//
// Example 1:
//
//
// Input: n = 12
// Output: 3 
// Explanation: 12 = 4 + 4 + 4.
//
// Example 2:
//
//
// Input: n = 13
// Output: 2
// Explanation: 13 = 4 + 9.
//


class Solution {
    public int numSquares(int n) {
        if(square(n)){
            return 1;
        }
        int tmp=n;
        while(tmp%4==0){
            tmp/=4;
        }
        if(tmp%8==7){
            return 4;
        }
        int sqrt_n = (int)(Math.sqrt(n)); 
        for(int i = 1; i <= sqrt_n; i++)
        {  
            if (square(n - i*i)) 
            {
                return 2;  
            }
        } 
        return 3;
        
    }
    public boolean square(int n){
        int num=(int)Math.sqrt(n);
        return (num*num==n);
    }
}
