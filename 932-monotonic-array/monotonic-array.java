// An array is monotonic if it is either monotone increasing or monotone decreasing.
//
// An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
//
// Return true if and only if the given array A is monotonic.
//
//  
//
//
//
//
//
// Example 1:
//
//
// Input: [1,2,2,3]
// Output: true
//
//
//
// Example 2:
//
//
// Input: [6,5,4,4]
// Output: true
//
//
//
// Example 3:
//
//
// Input: [1,3,2]
// Output: false
//
//
//
// Example 4:
//
//
// Input: [1,2,4,5]
// Output: true
//
//
//
// Example 5:
//
//
// Input: [1,1,1]
// Output: true
//
//
//  
//
// Note:
//
//
// 	1 <= A.length <= 50000
// 	-100000 <= A[i] <= 100000
//
//
//
//
//
//


class Solution {
    public boolean isMonotonic(int[] A) {
        if(A.length<2){
            return true;
        }
        int i=0;
        while(i<A.length-1&&A[i]==A[i+1]){
            i++;
        }
        if(i==A.length-1){
            return true;
        }
        if(A[i]>A[i+1]){
            for(int j=i+1;j<A.length-1;j++){
                if(A[j]<A[j+1]){
                    return false;
                }
            }
        }else{
                        for(int j=i+1;j<A.length-1;j++){
                if(A[j]>A[j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}