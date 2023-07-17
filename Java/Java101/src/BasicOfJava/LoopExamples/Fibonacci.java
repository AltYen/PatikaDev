package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;

        System.out.print("N: ");
        n=inp.nextInt();

        int a1=0,a2=1,newValue;
        for(int i = 1; i<n;i++){
            newValue=a1+a2;
            System.out.println(a1 + " + " + a2 + " = " + newValue);
            a1=a2;
            a2=newValue;
        }

    }
}
