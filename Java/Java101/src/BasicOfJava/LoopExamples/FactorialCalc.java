package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class FactorialCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number,sum=1;
        System.out.print("Number : ");
        number = inp.nextInt();



        for (int i = 1; i<=number;i++){
            sum*=i;
        }
        System.out.println(number+"! = "+sum);
    }
}
