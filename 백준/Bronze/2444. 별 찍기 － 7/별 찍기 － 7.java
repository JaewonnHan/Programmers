import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a-i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=a-1; i>=0; i--){
            for(int j=0; j<a-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}