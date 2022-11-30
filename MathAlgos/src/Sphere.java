import java.util.Scanner;
import java.math.*;
public class Sphere {
	public static void main(String args[]) {try {
		Scanner sc = new Scanner(System.in);
		double pi = Math.PI; //value of pi
		int r = 0; // value of radius
		
		System.out.println("Enter value of radius: ");
		r = sc.nextInt();
		double V = (4/3)*pi*(Math.pow(r, 3));
		System.out.println("The Volume of the sphere is: "+ V+" cubic units");
	}catch(Exception e ) {
		System.out.println("ERROR: "+e);
	}
	}
}
