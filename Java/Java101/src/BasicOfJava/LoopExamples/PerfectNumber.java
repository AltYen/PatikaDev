package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number,toplam=0;

        System.out.print("Bir sayı giriniz: ");
        number=inp.nextInt();

        for(int i=1;i<=number;i++){
            if(i==number)
                continue;
            if(number%i == 0)
                toplam+=i;
        }

        if(number==toplam)
            System.out.println(number + " Mükemmel sayidir.");
        else
            System.out.println(number + " Mükemmel sayı değildir.");
    }
}
