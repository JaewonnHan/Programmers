import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        
        int min = H*60 + M;
        min += T;
        
        int hour = (min/60) % 24;
        int minute = min % 60;
        
        System.out.println(hour + " "+ minute );
    }
}