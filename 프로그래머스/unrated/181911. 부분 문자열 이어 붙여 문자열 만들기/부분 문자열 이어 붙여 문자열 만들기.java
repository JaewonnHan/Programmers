import java.util.*;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        List<String> answers = new ArrayList<>();
        String str ="";
        
        for(int i=0; i<parts.length; i++){
            answers.add(my_strings[i].substring(parts[i][0],parts[i][1]+1));
        }
        for(String answer : answers){
            str += answer;
        }
        return str;
    }
}