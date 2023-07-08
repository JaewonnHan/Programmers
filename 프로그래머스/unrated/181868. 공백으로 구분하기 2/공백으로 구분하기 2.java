import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        String[] strArr = my_string.split(" ");
        for(String str : strArr){
            if(!str.equals("")){
                answer.add(str);
            }
        }
        
        return answer.toArray(new String[0]);
    }
}