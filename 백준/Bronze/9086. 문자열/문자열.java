import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++){
            String s= br.readLine();
            sb.append(s.charAt(0));
            sb.append(s.charAt(s.length()-1)+"\n");
        }
        System.out.print(sb);
    }
}