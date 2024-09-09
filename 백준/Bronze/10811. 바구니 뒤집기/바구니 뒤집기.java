import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] array = new int[N+1];
        for(int i=1; i<=N; i++){
            array[i] = i;
        }
        for(int j=0; j<M; j++){
            int med = 0;
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            while(left < right){
                med = array[left];
                array[left] = array[right];
                array[right] = med;
                left ++;
                right--;
            }
           
        }
        for(int s=1; s<array.length; s++){
            System.out.print(array[s] + " ");
        }
        
        
    }
}