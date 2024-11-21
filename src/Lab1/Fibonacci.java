import java.util.Scanner;
public class Fibonacci {

    public static void fibonacci() {
        int n = 3;
        int fn; 
        int fnMinus1 = 1;
        int fnMinus2 = 1; 
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2; 
        System.out.println("The first " + nMax + " Fibonacci numbers are:");
        System.out.print(fnMinus2 + " " + fnMinus1 + " ");
        while (n <= nMax) {
          
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " ");
            sum += fn;
        
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        
    }


    public static void tribonacci() {
        int n = 4;
        
        int fn;
        int fnMinus1 = 2; // F(n-1), init to F(3)
        int fnMinus2 = 1; // F(n-2), init to F(2)
        int fnMinus3 = 1; // F(n-3), init to F(1)
        int nMax = 20; 
        int sum = fnMinus1 + fnMinus2 + fnMinus3; 
        double average;
        System.out.println("The first " + nMax + " Tribonacci numbers are:");
        System.out.print(fnMinus3 + " " + fnMinus2 + " " + fnMinus1 + " ");
        while (n <= nMax) {
            
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            System.out.print(fn + " ");
            sum += fn;
            
            ++n;
            fnMinus3 = fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
   
    }

}