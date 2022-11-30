import java.util.*;
import java.time.*;

public class simple {
	public static void selectionsort(int [] ss) {
		
		for (int lastPlace = ss.length-1; lastPlace > 0; lastPlace--) {
			// Find the largest item among A[0], A[1], ...,
			// A[lastPlace], and move it into position lastPlace
			// by swapping it with the number that is currently
			// in position lastPlace.
			int maxLoc = 0; // Location of largest item seen so far.
			for (int j = 1; j <= lastPlace; j++) {
			if (ss[j] > ss[maxLoc]) {
			// Since A[j] is bigger than the maximum we’ve seen
			// so far, j is the new location of the maximum value
			// we’ve seen so far.
			maxLoc = j;
			}
			}
			int temp = ss[maxLoc]; // Swap largest item with A[lastPlace].
			ss[maxLoc] = ss[lastPlace];
			ss[lastPlace] = temp;
			} // end of for loop
		}
	
	
	public static void Ascendsort(int [] n) {
		int sorted;
		for(sorted=0;sorted<n.length;sorted++) {
			int temp = n[sorted];
			int loc = sorted-1;
			
			while(loc>=0 && n[loc]>temp) {
				n[loc+1] = n[loc];
				loc=loc-1;
			}
			n[loc+1]=temp;
		}
	
	}
	
	public static void main(String args[]) {
		//int Array[]= new int [10];
		long startTime,endtime;
		double time;
		int Array[]= {-12,23,4,78,5,12,67,34,33,-3,90,54,-1,88,7,10,29,76};
		startTime=System.currentTimeMillis();
				
		//Scanner input = new Scanner(System.in);
		//for(int a=0;a<Array.length;a++) {
			
		/**while(input.toString()=="0")
			System.out.println("ENTER A VALUE: ");
			Array[a]=input.nextInt();
			a++;
			**/
		
		//}
		
		selectionsort(Array);
		for(int i:Array) {
		System.out.print(i+" ");
		
		
		}
		System.out.println("\n");
endtime = System.currentTimeMillis();
		
		time=(endtime-startTime)/1000.0000000000;
		System.out.print(time);
	}
}