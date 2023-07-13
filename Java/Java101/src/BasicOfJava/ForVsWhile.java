package BasicOfJava;

import java.util.Scanner;

public class ForVsWhile {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi;

        /*
        for(boolean run=true; run; ){
            System.out.print("Sayi Giriniz : ");
            sayi = inp.nextInt();
            if(sayi<0){
                run=false;
            }
        }

         */

        /*
        System.out.print("Sayi Giriniz : ");
        sayi = inp.nextInt();
        while(sayi>0){
            System.out.print("Sayi Giriniz : ");
            sayi = inp.nextInt();
        }

         */

        do {
            System.out.print("Sayi Giriniz : ");
            sayi = inp.nextInt();
        }
        while(sayi>0);

        /*
        for(int i = 1;i<=10;i++){
            System.out.println(i);
        }

        System.out.println("----");

        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }

         */

    }
}
