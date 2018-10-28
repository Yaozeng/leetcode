// There are a number of spherical balloons spread in two-dimensional space. For each balloon, provided input is the start and end coordinates of the horizontal diameter. Since it's horizontal, y-coordinates don't matter and hence the x-coordinates of start and end of the diameter suffice. Start is always smaller than end. There will be at most 104 balloons.
//
// An arrow can be shot up exactly vertically from different points along the x-axis. A balloon with xstart and xend bursts by an arrow shot at x if xstart ≤ x ≤ xend. There is no limit to the number of arrows that can be shot. An arrow once shot keeps travelling up infinitely. The problem is to find the minimum number of arrows that must be shot to burst all balloons. 
//
// Example:
//
// Input:
// [[10,16], [2,8], [1,6], [7,12]]
//
// Output:
// 2
//
// Explanation:
// One way is to shoot one arrow for example at x = 6 (bursting the balloons [2,8] and [1,6]) and another arrow at x = 11 (bursting the other two balloons).
//
//


class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0) return 0;
        if(points.length==1) return 1;
        Arrays.sort(points,new Comparator<int []>(){
             public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int start=points[0][0];
        int end=points[0][1];
        int count=0;
        for(int i=1;i<points.length;){
            if(end>=points[i][0]){
                start=points[i][0];
                end=Math.min(end,points[i][1]);
                i++;
            }else{
                count++;
                start=points[i][0];
                end=points[i][1];
                i++;
            }
        }
        return count+1;
    }
}
