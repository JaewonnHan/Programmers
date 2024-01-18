import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int temp;
        for (int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        for(int j=0; j<M; j++){
            st = new StringTokenizer(br.readLine()," ");
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            temp = arr[P-1];
            arr[P-1] = arr[Q-1];
            arr[Q-1] = temp;
        }
        for(int value : arr){
            bw.write(value+" ");
        }
        br.close();
        bw.flush();
        bw.close();
       
    }
}