package HackerRankExamples;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi : ");
        n=inp.nextInt();

        if(n>=1 && n<=100){
            if(n%2 == 1)
                System.out.println("Weird");
            else{
                if(n>=2 && n<=5)
                    System.out.println("Not Weird");
                else if (n>=6 && n<=20) {
                    System.out.println("Weird");
                }else
                    System.out.println("Not Weird");
            }
        }else
            System.out.println("Out Of Range");
    }
}
