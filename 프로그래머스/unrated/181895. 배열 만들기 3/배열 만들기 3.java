import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>() ;
       for(int i=0; i<=1; i++)
           for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
               answer.add(arr[j]);
           }
        
        
        
        
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}