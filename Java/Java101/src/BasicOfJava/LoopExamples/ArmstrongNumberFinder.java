package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class ArmstrongNumberFinder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number,tempNumber,basamak=0,basamakDegeri,basamakKuvveti=0,toplam=0;

        System.out.print("Number : ");
        number = inp.nextInt();
        tempNumber=number;

        while(tempNumber != 0) {
            tempNumber/=10;
            basamak++;
        }

        tempNumber = number;

        while(tempNumber != 0){
            basamakDegeri = tempNumber % 10;
            basamakKuvveti=1;
            for (int i = 1;i<=basamak;i++){
                 basamakKuvveti*=basamakDegeri;
            }
            toplam+=basamakKuvveti;
            tempNumber/=10;
        }

        if(number==toplam)
            System.out.println(number + " bir armstrong sayısıdır");
        else
            System.out.println(number + " bir armstrong sayısı değildir");



    }
}
