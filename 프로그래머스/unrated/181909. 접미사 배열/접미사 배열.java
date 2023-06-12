import java.util.*;
class Solution {
    
    public static String[] stringArraysort(String[] words){
        for(int i=0; i < words.length - 1; i++){
            for(int j= i+1; j<words.length; j++ ){
                if(words[i].compareTo(words[j]) > 0){
                    String tmp = words[i];
                    words[i] = words[j];
                    words[j] = tmp;
                }
            }
        }
        return words;
    }
    
    
    
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
       for(int i=0; i<my_string.length(); i++){
           list.add(my_string.substring(i));
       }
        String[] nList = list.toArray(new String[list.size()]);
        return stringArraysort(nList);
    }
}