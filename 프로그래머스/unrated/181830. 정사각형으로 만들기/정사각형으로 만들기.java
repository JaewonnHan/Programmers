class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer1 = new int[arr.length][arr.length];
        int[][] answer2 = new int[arr[0].length][arr[0].length];
        if(arr.length > arr[0].length){
            
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    answer1[i][j] = arr[i][j];
                }
            }
            return answer1;
            
        }else if(arr.length < arr[0].length){
            
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    answer2[i][j] = arr[i][j];
                }
            }
            return answer2;
            
        }else{
          return arr;  
        }
        
          
        }
        
    }
