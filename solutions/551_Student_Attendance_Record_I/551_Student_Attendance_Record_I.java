// You are given a string representing an attendance record for a student. The record only contains the following three characters:
//
//
//
// 'A' : Absent. 
// 'L' : Late.
//  'P' : Present. 
//
//
//
//
// A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).    
//
// You need to return whether the student could be rewarded according to his attendance record.
//
// Example 1:
//
// Input: "PPALLP"
// Output: True
//
//
//
// Example 2:
//
// Input: "PPALLL"
// Output: False
//
//
//
//
//


class Solution {
    public boolean checkRecord(String s) {
        int countA=0;
        int countL=0;
        int max=0;
        char [] array=s.toCharArray();
        char last=array[0];
        if(array[0]=='A') countA++;
        if(array[0]=='L') countL++;
        for(int i=1;i<array.length;i++){
            if(array[i]=='A') countA++;
            if(array[i]=='L'){
                if(countL==0){
                    countL++;
                }else{
                    if(last=='L'){
                        countL++;
                    }else{
                        countL=1;
                    }
                }
            }
            last=array[i];
            if(countL>max) max=countL;
        }
        if(countA>1){
            return false;
        }else{
            if(max>2){
                return false;
            }
        }
        return true;
    }
}
