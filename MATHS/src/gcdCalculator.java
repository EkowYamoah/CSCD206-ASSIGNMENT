
import java.util.Scanner;



class gcdCalculator{
	

		public static int gcd(int m, int n){
		int a = m;
		int b = n;
		int r=0;
		
	
		
		while(b !=0){
	 		r = a%b;
			
			a=b;
			b=r;
			
		}
		return a;
			
		
		}	
	public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int a;
	int b;
	System.out.println("FIRST NO. : ");
	a = in.nextInt();
	System.out.println("SECOND NO. : ");
	b=in.nextInt();
	
	if(b<a) {
	gcd(a,b);
	System.out.println("GCD = "+ gcd(a,b));
	}else {
		gcd(b,a);
		System.out.println("GCD = "+ gcd(b,a));
	}
	
	}
}