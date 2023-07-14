package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        int number=0,sum=0;

        /*
        do{
            System.out.print("Number : ");
            number = inp.nextInt();

            if(number % 2 == 1)
                sum+=number;

        }while(number>=0);

        System.out.println("Odd Number Sum : " + sum);

         */

        do{
            System.out.print("Number : ");
            number = inp.nextInt();

            if((number % 2 == 0) && (number % 4 == 0))
                sum+=number;

        }while(number % 2 == 0);

        System.out.println(sum);

    }
}
