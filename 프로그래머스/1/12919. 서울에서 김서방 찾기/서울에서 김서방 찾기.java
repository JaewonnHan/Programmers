class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int x = 0; 
        int N = seoul.length; 
        for(int i=0; i<N; i++){
            if(seoul[i].equals("Kim") ){
                x = i;
                break; 
            }
        }
        answer = "김서방은 " + x + "에 있다";
        return answer;
    }
}