import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for(int i=0; i<N; i++){
            String st = br.readLine();
            str[i] = st.substring(0,1) + st.substring(st.length()-1, st.length());
        }
        for(int i=0; i<N; i++){
            System.out.println(str[i]);
            
        }
    }
}