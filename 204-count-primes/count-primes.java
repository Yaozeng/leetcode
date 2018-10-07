// Count the number of prime numbers less than a non-negative number, n.
//
// Example:
//
//
// Input: 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
//
//


class Solution {
    public int countPrimes(int n) {
        boolean [] isPrimer=new boolean[n];
        for(int i=0;i<n;i++){
            isPrimer[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(!isPrimer[i]) continue;
            for(int j=i*i;j<n;j+=i){
                isPrimer[j]=false;
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrimer[i]) count++;
        }
        return count;
    }
}
