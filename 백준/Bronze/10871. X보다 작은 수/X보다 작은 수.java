import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int value = 0;
    int N = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine(), " ");
    for(int i=0; i<N; i++){
         value = Integer.parseInt(st.nextToken());   
        if(value < P){
            bw.write(value+"\n");
        }
    }
        br.close();
    bw.flush();
    bw.close();
        }
        }
        
        
        
        
    

   
    


        