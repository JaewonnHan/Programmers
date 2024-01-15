import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int A = Integer.parseInt(br.readLine());
        
        
        for(int i=1; i<=A; i++){
            st = new StringTokenizer(br.readLine()," ");
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            
            bw.write("Case #" + i+": ");
            bw.write(B+" + "+C+" = ");
            bw.write((B+C) + "\n");
       
        }
        br.close();
        bw.flush();
        bw.close();
      
        
    }
}