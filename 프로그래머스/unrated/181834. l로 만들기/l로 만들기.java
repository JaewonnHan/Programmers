class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] ch = myString.toCharArray();
        for(char c : ch){
            if(c < 'l'){
                answer += "l";
            }else{
                answer += c;
            }
        }
        return answer;
    }
}