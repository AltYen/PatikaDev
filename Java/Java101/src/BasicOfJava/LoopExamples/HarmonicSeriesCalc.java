package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class HarmonicSeriesCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        double sum=0;

        System.out.print("N : ");
        n = inp.nextInt();
        for (double i = 1;i<=n;i++){
            sum += 1/ i;
        }

        System.out.println(sum);

    }
}
