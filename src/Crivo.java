import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.function.Function;

public class Crivo {
	
	public static void main(String ... args) {
		//
		
		Scanner s = new Scanner(System.in);
		int n = 0, primos =0, primosEspeciais =0;
		//BufferedReader s2 = new BufferedReader(new InputStreamReader(System.in));
		n = 1 << s.nextInt();
		
	    boolean [] crivo  = new boolean[n];
	    
	   for(int i = 2; i < crivo.length; i++) {
		   crivo[i] = true;
	   }
	   
	   for(int i = 2; i < crivo.length; i++) {
		   if(crivo[i] == true) {
			   primos ++;
			   if(i % 4 != 3) {
				   primosEspeciais ++;
			   }
			   for(int j = i * 2; j < n; j += i) {
				   crivo[j] = false;
			   }	
			   		
		   }		   
	   }
	   
	   System.out.println(primos + " " + primosEspeciais);
	   //System.out.println(crivo.length + " " + crivo[crivo.length-1]);
	    
		
		
	}

}
