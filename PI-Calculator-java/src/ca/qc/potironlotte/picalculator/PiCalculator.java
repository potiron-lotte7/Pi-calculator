package ca.qc.potironlotte.picalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PiCalculator {
    public static void main(String[] args) {

        long nbRepetition = 1_001;
        boolean showIntermediateSteps = false;

        if(args.length > 0){
            if(args[0].equals("-i")) {
                try {
                    nbRepetition = Long.parseLong(args[1]) + 1;
                } catch(NumberFormatException ignored) {
                }
            } else if(args[0].equals("-s")) {
                showIntermediateSteps = true;
            }

            if(args.length > 2) {
                if(args[2].equals("-s")) {
                    showIntermediateSteps = true;
                } else if(args[1].equals("-i")) {
                    System.out.println("second argument is -i");
                    try {

                        nbRepetition = Long.parseLong(args[2]) + 1;
                    } catch(NumberFormatException ignored) {

                    }
                }
            }
        }


        /*Max precision:*/
//        long nbRepetition = Long.MAX_VALUE;



        //the taylor series
        double piDouble = 0.0;

        BigDecimal pi = new BigDecimal(piDouble);
        for(long i = 0; i < nbRepetition; i++) {

            BigDecimal temp = BigDecimal.valueOf((2.0 * i) + 1.0);
            BigDecimal temp2 = BigDecimal.valueOf(Math.pow((-1), i));

            BigDecimal operation = temp2.divide(temp, 5000, RoundingMode.HALF_UP);
            pi = pi.add(operation);

            BigDecimal temp3 = new BigDecimal("4.0");
            if(showIntermediateSteps) {

                System.out.println(i + ": " + (pi.multiply(temp3)));
            }
        }


        BigDecimal multiple = new BigDecimal("4.0");
        pi = pi.multiply(multiple);



        //print
        System.out.println("\n\nPi: \n\n" + pi + "\n\n");
    }
}
