import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("a|b|c", " ");

        ArrayList <String> list = new ArrayList <> ();

        String[] split = myStr.split(" ");
        for(int i = 0; i < split.length; i++){
            if(!split[i].equals("")){
                list.add(split[i]);
            }
        }

        String[] answer = new String [list.size()];

        if(answer.length == 0){
            answer = new String[1];
            answer[0] = "EMPTY";
            return answer;
        }


        for(int i = 0; i < list.size(); i ++){
            answer[i] = list.get(i);
        }


        return answer;
    }
}
