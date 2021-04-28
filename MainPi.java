package pi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainPi {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*manual precision*/
		/*

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of time to do the sum: ");
		long nbRepetition = Long.parseLong(reader.readLine());

		 */
		
		
		/*Max precision:*/
		long nbRepetition = Long.MAX_VALUE;



		//the taylor series
		Double piDouble = 0.0;

		BigDecimal pi = new BigDecimal(piDouble);
		for(long i = 0; i < nbRepetition; i++) {

			BigDecimal temp = new BigDecimal((2.0*i)+1.0);
			BigDecimal temp2 = new BigDecimal(Math.pow((-1), i));

			BigDecimal operation = temp2.divide(temp, 5000, RoundingMode.HALF_UP);
			pi = pi.add(operation);

			BigDecimal temp3 = new BigDecimal(4.0);
			System.out.println(i + ": " + (pi.multiply(temp3)));
		}
		
		
		
		// ***4*** arctanx  x = 1 = Pi
		BigDecimal mult = new BigDecimal(4.0);
		pi = pi.multiply(mult);



		//print
		System.out.println("\n\nPi: \n\n" + pi + "\n\n");
	}
}
