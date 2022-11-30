import java.util.Scanner;
public class fibonacciNumbers 																																													{
	public static void main(String args[]) 																																										{
		try																																																		{
		Scanner sc =new Scanner(System.in)   /* to take user input*/																																										;
		int counter = 0;	
		
				int gN;	/* number of elements */	
		int a=0; /*first number */ 
		
		int b=0; /*second number */ 
		
		int c=0; /*current number */
		
		System.out.print("Enter First Number: "); a = sc.nextInt(); System.out.println("\n");
		
		System.out.println("Enter number of elements to generate: "); gN = sc.nextInt(); System.out.println("\n\n"); 
		 
			if(a==0) {
				System.out.println(a);
				a+=1;
				
				while(counter<gN-1)
				{
			
			c=a+b;	
			a=b;
			b=c; 
			
			counter+=1; 
			
			System.out.println(c);
				}
			}else {
				while(counter<gN)
				{
			
			c=a+b;	
			a=b;
			b=c; 
			counter+=1; 
		
		
		System.out.println(c);		
			}}																																																			}
	catch(Exception e) 																																															{
		
		System.out.println("ERROR: "+e);
												
	}
																																																				}
																																																				}