package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int number;
        System.out.print("Kuvvet : ");
        number = inp.nextInt();

        /*
        for(int i = 0;i<=number;i++){
            System.out.println("2^"+i+"="+ (int) Math.pow(2,i));
        }
         */

        for(int i = 0;i<=number;i++){
            System.out.println("4^"+i+"="+ (int) Math.pow(4,i));
        }

        System.out.println("----");

        for(int i = 0;i<=number;i++){
            System.out.println("5^"+i+"="+ (int) Math.pow(5,i));
        }

    }
}
