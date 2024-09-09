import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args)throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            double[] array = new double[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            double sum = 0; 
            for(int i=0; i<N; i++){
                array[i] = Double.parseDouble(st.nextToken());
                
            }
            Arrays.sort(array);
            for(int i=0; i<N; i++){
                sum += (array[i]/array[N-1] * 100);
            }
            System.out.print(sum / N);
            
        }
    }
