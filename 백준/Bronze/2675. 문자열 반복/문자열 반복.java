import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            for(int j=0; j<S.length(); j++){
                for(int k=0; k<P; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}