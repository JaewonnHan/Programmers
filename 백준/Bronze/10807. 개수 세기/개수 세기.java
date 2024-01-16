import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int P = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<N; i++){
            if(arr[i] == P){
                count++;
            }
        }
        bw.write(count+"\n");
        bw.flush();
        bw.close();
        
        
    }
}