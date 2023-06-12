import java.util.*;


class Solution {
    
    
    public String solution(String my_string, int[][] queries) {
        char[] answer = my_string.toCharArray();
        char tmp;
        for (int i=0; i< queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j= start; j<=(start+end)/2; j++){
                tmp = answer[j];
                answer[j] = answer[start+end-j];
                answer[start+end-j] = tmp;
                    
                
            }
                 
            
        }

        
        
        return String.valueOf(answer);
    }
}