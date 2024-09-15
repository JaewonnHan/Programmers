import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = 1;
        int q = 1;
        int r = 2;
        int b = 2;
        int n = 2;
        int p = 8;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        k = k - Integer.parseInt(st.nextToken());
        q = q - Integer.parseInt(st.nextToken());
        r = r - Integer.parseInt(st.nextToken());
        b = b - Integer.parseInt(st.nextToken());
        n = n - Integer.parseInt(st.nextToken());
        p = p - Integer.parseInt(st.nextToken());
        sb.append(k + " ");
        sb.append(q + " ");
        sb.append(r + " ");
        sb.append(b + " ");
        sb.append(n + " ");
        sb.append(p + " ");
        System.out.print(sb);
        
           
    }
}