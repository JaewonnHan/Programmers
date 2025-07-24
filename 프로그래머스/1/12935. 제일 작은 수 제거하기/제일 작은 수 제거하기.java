import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int N = arr.length; 
        if (N==1){
            
            return new int[]{-1};
        }
        answer = new int[arr.length-1];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        int index = 0;
        for(int i=0; i<N; i++){
            if(arr[i] == min){
                continue; 
            }
            answer[index++] = arr[i];
            
            }
        return answer; 
        
    }
}