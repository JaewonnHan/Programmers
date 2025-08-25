import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String a = br.readLine();
       StringBuilder sb = new StringBuilder();
       
        for(char c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        
        
    }
}