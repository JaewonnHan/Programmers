import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        
        List<String> list = new ArrayList<>();
        List<String> answer = new ArrayList<>();
       for(String str : picture){
           String temp="";
           char[] ch = str.toCharArray();
            for(int i=0; i<ch.length; i++){
                for(int j=0; j<k; j++){
                    temp += String.valueOf(ch[i]);
                }
                
            }
            list.add(temp);
       }
        for(String str : list){
            for(int i=0; i<k; i++){
                answer.add(str);
            }
        }
            
        
        
        
        
        return answer.toArray(new String[0]);
    }
}