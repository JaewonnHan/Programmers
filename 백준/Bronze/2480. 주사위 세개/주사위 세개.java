import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int a, b, c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();

		if (a != b && b != c && a != c) {
			int max=0;
			
			if (a > b) {
		
				if (c > a) {
					max = c;
				} 
				
				else {
					max = a;
				}
			}
		
			else if(b>a) {
				
				if (c > b) {
					max = c;
				}
			
				else {
					max = b;
				}
			}
			System.out.println(max * 100);
		}
		
		else if(a==b && b==c && c==a) {
            	System.out.println(10000 + a * 1000);
        }
		else {
				
				if(a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
				
				else {
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
