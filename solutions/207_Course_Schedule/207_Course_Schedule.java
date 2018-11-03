// There are a total of n courses you have to take, labeled from 0 to n-1.
//
// Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
//
// Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
//
// Example 1:
//
//
// Input: 2, [[1,0]] 
// Output: true
// Explanation: There are a total of 2 courses to take. 
//              To take course 1 you should have finished course 0. So it is possible.
//
// Example 2:
//
//
// Input: 2, [[1,0],[0,1]]
// Output: false
// Explanation: There are a total of 2 courses to take. 
//              To take course 1 you should have finished course 0, and to take course 0 you should
//              also have finished course 1. So it is impossible.
//
//
// Note:
//
//
// 	The input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented.
// 	You may assume that there are no duplicate edges in the input prerequisites.
//
//


class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length==0) return true;
        int [] countIn=new int [numCourses];
        Map <Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<prerequisites.length;i++){
            countIn[prerequisites[i][0]]++;
            if(map.containsKey(prerequisites[i][1])){
                map.get(prerequisites[i][1]).add(prerequisites[i][0]);
            }else{
                List<Integer> list=new ArrayList<>();
                list.add(prerequisites[i][0]);
                map.put(prerequisites[i][1],list);
            }
        }
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<countIn.length;i++){
            if(countIn[i]==0){
                que.add(i);
            }
        }
        int count=0;
        List <Integer> tmpList;
        while(!que.isEmpty()){
            int tmp=que.poll();
            count++;
            if(map.containsKey(tmp)){
                tmpList=map.get(tmp);
                for(int i=0;i<tmpList.size();i++){
                countIn[tmpList.get(i)]--;
                if(countIn[tmpList.get(i)]==0){
                    que.add(tmpList.get(i));
                }
            }
            }            
        }
        if(count==numCourses) return true;
        return false;
    }
}
