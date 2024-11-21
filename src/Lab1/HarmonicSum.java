package Lab1;

public class HarmonicSum {
    public static void main(String[] args) {
        final int MAXDENOMINATOR = 500;

        double sumL2R = 0.0;
        double sumR2L = 0.0;

        for (int i = 1; i <= MAXDENOMINATOR; i++) {
            sumL2R += (double)1/i;
        }
        	System.out.println("The sum from left to right is " + sumL2R);

        for (int i = MAXDENOMINATOR; i >= 1; i--) {
            sumR2L += (double)1/i;
        }
        	System.out.println("The sum from right to left is " + sumR2L);

        if (sumL2R > sumR2L) {
            System.out.println("SumL2R > sumR2L");
        } else {
            System.out.println("SumL2R < sumR2L");
        }
		  
	  System.out.println ("different is" + (sumR2L - sumL2R));
}
    
}
