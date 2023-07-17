package HackerRankExamples;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;

        System.out.print("Number: ");
        number=inp.nextInt();
        if(number>=2 && number<=20){
            for(int i = 1;i<=10;i++){
                System.out.println(number + " x " + i + " = " + number*i);
            }
        }
    }
}
