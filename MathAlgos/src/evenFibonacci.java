import java.math.*;

public class evenFibonacci {
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		int c =0;
		int sum=0;
		int o =2;
		
		int lim =(int)(4*(Math.pow(10, 6)));	//limit to 4 million
		while(c<lim) {
			c=a+b;
			a=b;
			b=c;
			if(c%2==0) {
			sum+=c;
			}
				
	}
	
	System.out.print("\nSUM = ");
	System.out.println(sum+o);
	}
}

