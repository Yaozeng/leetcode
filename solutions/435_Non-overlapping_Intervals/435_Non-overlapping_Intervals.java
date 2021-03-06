//
// Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
//
//
// Note:
//
// You may assume the interval's end point is always bigger than its start point.
// Intervals like [1,2] and [2,3] have borders "touching" but they don't overlap each other.
//
//
//
// Example 1:
//
// Input: [ [1,2], [2,3], [3,4], [1,3] ]
//
// Output: 1
//
// Explanation: [1,3] can be removed and the rest of intervals are non-overlapping.
//
//
//
// Example 2:
//
// Input: [ [1,2], [1,2], [1,2] ]
//
// Output: 2
//
// Explanation: You need to remove two [1,2] to make the rest of intervals non-overlapping.
//
//
//
// Example 3:
//
// Input: [ [1,2], [2,3] ]
//
// Output: 0
//
// Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
//
//


/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public int eraseOverlapIntervals(Interval[] intervals) {
        if(intervals.length<2) return 0;
        Arrays.sort(intervals,new IntervalComparetor());
        int count=0;
        Interval tmp=intervals[0];
        for(int i=1;i<intervals.length;){
            if(tmp.end>intervals[i].start){
                count++;
                 if(tmp.end>intervals[i].end){
                 tmp=intervals[i]; 
                }
                i++;

            }else{
 tmp=intervals[i];
                i++;
            }
        }
        return count;
    }
    class IntervalComparetor implements Comparator<Interval>{
        public int compare(Interval i1,Interval i2){
                    if(i1.start>i2.start){
            return 1;
        }else if(i1.start <i2.start){
            return -1;
        }else{
            return 0;
        }
        }
    }
}
