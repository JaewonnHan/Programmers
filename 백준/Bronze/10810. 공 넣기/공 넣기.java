import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[]arr = new int[N];
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int s= Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k =  Integer.parseInt(st.nextToken());
            for(int p=s-1; p<j; p++){
                arr[p] = k;
            }
        }
        for(int t=0; t<arr.length; t++){
            bw.write(arr[t]+ " ");
        }
        br.close();
        bw.flush();
        bw.close();
        
    }
}