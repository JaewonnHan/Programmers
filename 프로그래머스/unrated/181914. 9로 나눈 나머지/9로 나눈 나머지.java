import java.util.*;
class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] arr = number.split("");
        int[] arr2 = Arrays.stream(arr).mapToInt(Integer :: parseInt).toArray();
        for(int i=0; i<arr.length; i++){
            answer +=  arr2[i];
        }
        answer = answer % 9;
        
        
        return answer;
    }
}