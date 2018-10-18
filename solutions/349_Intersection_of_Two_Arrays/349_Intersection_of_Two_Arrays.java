// Given two arrays, write a function to compute their intersection.
//
// Example 1:
//
//
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
//
//
//
// Example 2:
//
//
// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
//
//
// Note:
//
//
// 	Each element in the result must be unique.
// 	The result can be in any order.
//
//
//  
//


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List <Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            while(i<nums1.length-1&&nums1[i]==nums1[i+1]) i++;
            while(j<nums2.length-1&&nums2[j]==nums2[j+1]) j++;
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int [] res=new int[list.size()];
        for(i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
