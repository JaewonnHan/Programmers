class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int c = 1; 
        int right = -1;
        int bottom = 0;
        int top = 1;
        
        for(int i=n; i>0; i--){
            for(int j=0; j<n; j++){
                right += top;
                answer[bottom][right] = c;
                c++;
            }
            n--;
            
            for(int j = 0; j < n; j++) {
                bottom += top;
                answer[bottom][right] = c;
                c++;
            }
            top = top * (-1);
        }
        
        
        
        
        return answer;
    }
}