import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        int a = 0;
		int b = in.nextInt();

        
		for (int i = 1; i <= b; i++) {
			a += i;
		}
		System.out.println(a);
	}
}