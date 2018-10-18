// Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
//
// Example:
//
//
// Given array nums = [-1, 2, 1, -4], and target = 1.
//
// The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//
//


public class Solution 
{
    public int threeSumClosest(int[] nums, int target) 
    {
        // sort the nums array
        Arrays.sort(nums);
        int closestSum = 0;
        int diff = Integer.MAX_VALUE;
        
        
        // iterate nums array, no need for the last two numbers because we need at least three numbers
        for(int i=0; i<nums.length-2; i++)
        {
            int left = i + 1;
            int right = nums.length - 1;
            
            // use two pointers to iterate rest array
            while(left < right)
            {
                int temp_sum = nums[i] + nums[left] + nums[right];
                int temp_diff = Math.abs(temp_sum - target);
                // if find a new closer sum, then update sum and diff
                if(temp_diff < diff)
                {
                    closestSum = temp_sum;
                    diff = temp_diff;
                }
                
                if(temp_sum < target) // meaning need larger sum
                    left++;
                else if(temp_sum > target) // meaning need smaller sum
                    right--;
                else // meaning temp_sum == target, this is the closestSum 
                    return temp_sum;
            }
        }
        
        return closestSum;
    }
}
