package Hackerrank;

import java.util.Scanner;

class MyCalculators {
    public long power(int n, int p) throws Exception{
        if( n < 0 || p < 0){
            throw new Exception("n or p should not be negative.");
        }
        if( n == 0 && p == 0){
            throw new Exception("n and p should not be zero.");

        }else{
            long sum = 1;
            for(int i = 1; i<=p;i++){
                sum*=n;
            }
            return sum;
        }
    }

}

public class ExceptionHandling {
    public static final MyCalculators my_calculator = new MyCalculators();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
