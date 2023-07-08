import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        int returnanswer = 0;
        char[] array = myString.toCharArray();
        for(int i=0; i<myString.length(); i++){
            if(array[i] == 'A'){
                answer += "B";
            }else{
                answer += "A";
            }
        }
        if (answer.contains(pat)){
            returnanswer = 1;
        }
        
        return returnanswer;
        
    }
}