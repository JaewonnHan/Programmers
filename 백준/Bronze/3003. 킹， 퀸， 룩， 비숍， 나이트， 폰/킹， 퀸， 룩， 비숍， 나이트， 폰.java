import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] chess = {1,1,2,2,2,8};
        int[] number = new int[chess.length];
        
        for(int i=0; i<chess.length; i++){
            number[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<chess.length; i++){
            System.out.print(chess[i] - number[i]+" ");
        }
    }
}