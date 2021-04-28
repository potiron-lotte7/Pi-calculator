package pi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainPi {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*manual precision*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of time to do the sum: ");
		long nbRepetition = Long.parseLong(reader.readLine());
		
		/*Max precision:*/
		//long nbRepetition = Long.MAX_VALUE;
		
		
		
		//the taylor series
		Double pi = 0.0 , temp = 0.0 ;
		for(long i = 0; i < nbRepetition; i++) {
			//temporary variable
			temp = (Math.pow((-1), i)) / ((2*i)+1);
			//add previous temporary variable to actual sum
			pi = pi + temp;
		}
		// ***4*** arctanx  x = 1 = Pi
		pi = pi*4.0;
		
		
		
		//print
		System.out.println("\n\nAproximation de Pi: \n\n" + pi);

		//difference with Pi from Eclipse -- Math.PI
		System.out.println(pi - Math.PI);
	}
}
