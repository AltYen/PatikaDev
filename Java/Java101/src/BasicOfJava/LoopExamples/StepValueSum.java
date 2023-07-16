package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class StepValueSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number,tempNum,basamakDegeri,toplam=0;

        System.out.print("Number : ");
        number = inp.nextInt();
        tempNum = number;

        while (tempNum != 0){
            basamakDegeri = tempNum % 10;
            toplam+=basamakDegeri;
            tempNum/=10;
        }

        System.out.println(number + "=" + toplam);
    }
}
