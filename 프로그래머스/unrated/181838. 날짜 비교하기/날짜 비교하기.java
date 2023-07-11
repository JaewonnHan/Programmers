class Solution {
    public int solution(int[] date1, int[] date2) {
        String number1 = "";
        String number2 = "";
        for(int i=0; i<date1.length; i++){
            number1 += date1[i];
            number2 += date2[i];
        }
       
        
        return Integer.parseInt(number1) < Integer.parseInt(number2) ? 1 : 0;
    }
}