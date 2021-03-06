// In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty. 
//
// There is at least one empty seat, and at least one person sitting.
//
// Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized. 
//
// Return that maximum distance to closest person.
//
//
// Example 1:
//
//
// Input: [1,0,0,0,1,0,1]
// Output: 2
// Explanation: 
// If Alex sits in the second open seat (seats[2]), then the closest person has distance 2.
// If Alex sits in any other open seat, the closest person has distance 1.
// Thus, the maximum distance to the closest person is 2.
//
//
// Example 2:
//
//
// Input: [1,0,0,0]
// Output: 3
// Explanation: 
// If Alex sits in the last seat, the closest person is 3 seats away.
// This is the maximum distance possible, so the answer is 3.
//
//
// Note:
//
//
// 	1 <= seats.length <= 20000
// 	seats contains only 0s or 1s, at least one 0, and at least one 1.
//
//
//
//


class Solution {
    public int maxDistToClosest(int[] seats) {
        int max=0;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==0){
                int j=i;
                while(j>=0&&seats[j]==0){
                    j--;                   
                }
                int left=i-j;
                j=i;
                while(j<seats.length&&seats[j]==0){
                    j++;
                }
                int right=j-i;
                if(i==0){
                    max=Math.max(max,right);
                }else if(i==seats.length-1){
                     max=Math.max(max,left);
                }else{
                 max=Math.max(max,Math.min(right,left));
                }

            }
        }
        return max;
    }
}
