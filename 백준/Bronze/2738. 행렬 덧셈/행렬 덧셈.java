import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        for(int i=0; i<A.length; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<A[i].length; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
         for(int i=0; i<B.length; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<B[i].length; j++){
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                sb.append(A[i][j] + B[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}