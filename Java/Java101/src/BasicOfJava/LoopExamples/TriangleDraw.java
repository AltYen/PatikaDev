package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class TriangleDraw {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;

        System.out.print("Number : ");
        number = inp.nextInt();

        for(int i = 1; i<=number;i++){
            for(int j=1;j<=(number-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i) -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = number; i>=1;i--){
            for(int j=1;j<=(number-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i) -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
