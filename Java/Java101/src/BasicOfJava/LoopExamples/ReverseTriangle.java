package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;

        System.out.print("Number: ");
        number=inp.nextInt();
        for(int i = number;i>=1;i--){
            for(int k=1;k<=number-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
