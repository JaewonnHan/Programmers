import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int[] answer = new int[arr.length];
        int answercount = 0;
        while (!Arrays.equals(answer,arr)){
            answer = arr.clone();
            for(int i=0; i<arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                }else if(arr[i] < 50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 +1;
                }
            }
            answercount++;
        }
        
        return answercount -1 ;
    }
}