import java.io.File; 
		import java.io.FileNotFoundException; 
		import java.io.FileReader; 

public class Filenot_Demo {		  
		    public static void main(String args[]) { try{
		    	
		    
		           // Following file does not exist 
		            File file = new File("E://BOLLYWODD.txt"); 
		  
		            FileReader fr = new FileReader(file); 
		    }catch(Exception e) {
		    	System.out.println("File not found");
		            
		
		    }
		}
}