import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] array = new int[N];
         int med = 0;
        for(int i=0; i<N; i++){
            array[i] = i+1;
        }
        for(int j=0; j<M; j++){
              
               st = new StringTokenizer(br.readLine());
               int P = Integer.parseInt(st.nextToken());
               int Q = Integer.parseInt(st.nextToken());
               med = array[P-1];
               array[P-1] = array[Q-1];
               array[Q-1] = med;
            }
        
      
        for(int s=0; s<array.length; s++){
            bw.write(array[s] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}