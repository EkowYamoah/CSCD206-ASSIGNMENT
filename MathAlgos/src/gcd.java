import java.util.Scanner;
import java.math.*;

public class gcd {
	
	public static int gcda(int a,int b){
		int x=a;
		int y=b;
		
		/*m= n*(Math.floor(m/n))+(m%n);*/
		
		while(y!=0) {
			int r = x%y;
			x=y;
			y=r;
		}
		return x;
	
}
	public static void main(String args[]) { try{
		int m ; int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("a: ");
		m= sc.nextInt();
		System.out.println("b: ");
		n=sc.nextInt();
		
		System.out.println("a = "+m+" b = "+n);
		gcda(m,n);
		System.out.println("\n" + "Therefore GCD("+m+", "+n+") = "+ gcda(m,n));
		System.out.println("\n\n");
		
//		main(null);
	}catch(Exception e) {
		System.out.println("Error: "+ e);
		
	}
}
}