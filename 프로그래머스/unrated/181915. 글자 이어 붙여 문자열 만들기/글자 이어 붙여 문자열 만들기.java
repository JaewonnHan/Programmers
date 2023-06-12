import java.util.*;
class Solution {
    public String solution(String my_string, int[] index_list) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<index_list.length; i++){
            char character = my_string.charAt(index_list[i]);
            list.add(character);
        }
        StringBuilder sb = new StringBuilder();
        for(char character : list){
            sb.append(character);
        }
        String answer = sb.toString();
        
        return answer;
    }
}