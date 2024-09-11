import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] array = new int[26];
    for(int i=0; i<26; i++){
    array[i] = -1;
    }
    String st = br.readLine();
    for(int i=0; i<st.length(); i++){
        char ch = st.charAt(i);
        if(array[ch - 'a'] == -1){
            array[ch-'a'] = i;
        }
    }
    for(int val : array){
        System.out.print(val + " ");
    
       }
    }
}