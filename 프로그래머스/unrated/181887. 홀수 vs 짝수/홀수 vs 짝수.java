import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int answer2 = 0;
        
        for(int i=0; i<num_list.length; i++){
            if((i+1) % 2 == 1){
                answer += num_list[i];
            }else if((i+1) % 2 == 0){
            answer2 += num_list[i];
        }
        }
        
        return (answer > answer2) ? answer : answer2;
    }
}