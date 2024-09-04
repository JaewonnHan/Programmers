import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(str.nextToken());
        int P = Integer.parseInt(str.nextToken());
        
         str = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int Q = Integer.parseInt(str.nextToken());
            if(Q < P){
                sb.append(Q).append(' ');
            }
        }
        System.out.print(sb);
        br.close();
        
    }
}