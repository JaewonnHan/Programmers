class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        char[] array = myString.toCharArray();
        int idx = myString.lastIndexOf(pat) + pat.length();
        for(int i=0; i< idx; i++){
            answer += array[i];
        }
        
        
        
        return answer;
    }
}