class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int[] query : queries){
            int sub = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = sub;
                
        }
        
        return arr;
    }
}