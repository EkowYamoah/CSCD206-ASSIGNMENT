

public class mult3_5 {
	public static void main(String args[]) {
		int a =3;
		int b =5;
		int sum =0;
		
		for(int m =1; m<10;m++) {
			int ra=m%a;
			int rb=m%b;
			
			if(ra==0 || rb ==0) {
			sum +=m;
			}
			}
		System.out.println("\n SUM = "+ sum);
	}
}
