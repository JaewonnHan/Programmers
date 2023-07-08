import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        String[] array = myString.split("x");
        ArrayList <String> list = new ArrayList <> ();
        for(int i=0; i<array.length; i++){
            if(!array[i].equals("")){
                list.add(array[i]);
            }
            
        }
        
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);

    


        return answer;
    }
}