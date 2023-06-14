class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int top = numer1 * denom2 + numer2 * denom1;
        int bottom = denom1 * denom2;
        int tmp = 1;
        for(int i = 1; i<=top && i<=bottom; i++){
            if(bottom %i == 0 && top % i ==0 ){
                tmp = i;
            }
        }
        answer[0] = top / tmp;
        answer[1] = bottom / tmp;
        return answer;
    }
}