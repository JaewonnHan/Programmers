import java.util.*;

class Solution {
    public int[] solution(String myString) {
        
        String[] strArr = myString.split("x",-1);
        List<Integer> answer = new ArrayList<>();
        
        for(String str : strArr){
            answer.add(str.length());
        }
        
        
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}