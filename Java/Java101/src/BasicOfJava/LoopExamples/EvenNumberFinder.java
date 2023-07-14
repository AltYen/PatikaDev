package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class EvenNumberFinder {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int limit,toplam=0,sayac=0;

        System.out.print("Üst limiti giriniz : ");
        limit = inp.nextInt();

        /*
        for(int i = 1; i<=limit; i++ ){
            if(i % 2 == 0)
                System.out.print(i+",");
        }
        System.out.println();
        int a = 1;
        while(a<=limit){
            if(a%2 == 0)
                System.out.print(a+",");
            a++;
        }

         */

        for(int i = 0;i<=limit;i++){
            if(i % 3 == 0 && i % 4 == 0){
                toplam+=i;
                sayac++;
            }
        }
        System.out.println("0-"+limit+" arasında 3 ve 4'e tam bölünenlerin toplamı = "+(toplam/sayac));
    }
}
