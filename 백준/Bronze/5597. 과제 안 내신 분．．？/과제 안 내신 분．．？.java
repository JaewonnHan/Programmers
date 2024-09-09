import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[]array = new int[31];
        for(int i=1; i<=28; i++){
            array[Integer.parseInt(br.readLine())] = 1;
        }
        for(int j=1; j<=30; j++){
            if(array[j] == 0){
                System.out.println(j);
            }
        }
    }
}