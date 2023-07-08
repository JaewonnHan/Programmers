import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> hashSet = new LinkedHashSet<>();
        for(int a : arr){
            hashSet.add(a);
        }
        List<Integer> answer = new ArrayList<>(hashSet);
        if(answer.size() >= k){
            while(answer.size() > k){
                answer.remove(answer.size() -1);
            }
        }else {
            for(int i= answer.size(); i<k; i++){
                answer.add(-1);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}