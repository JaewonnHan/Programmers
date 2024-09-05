import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        int count = 0;
        while(str.hasMoreTokens()){
            array[count] = Integer.parseInt(str.nextToken());
            count++;
        }
        Arrays.sort(array);
        System.out.print(array[0] + " " + array[N-1]);
    }
}