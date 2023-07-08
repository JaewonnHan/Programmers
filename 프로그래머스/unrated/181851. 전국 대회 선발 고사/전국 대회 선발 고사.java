import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int element : rank){
            list2.add(element);
        }
        for(int i=0; i<attendance.length; i++){
            if(attendance[i] == true){
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        answer = 10000 * list2.indexOf(list.get(0)) + 100 * list2.indexOf(list.get(1)) + list2.indexOf(list.get(2));
        
        
        
        return answer ;
    }
}