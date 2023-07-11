package BasicOfJava.Example;

import java.util.Scanner;

public class VeryBasicCalculator {
    public static void main(String[] args) {
        int a,b,secim;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayı : ");
        a=inp.nextInt();

        System.out.print("2. Sayı : ");
        b=inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        secim = inp.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplam : " + (a+b));
                break;
            case 2:
                System.out.println("Çıkarma : " + (a-b));
                break;
            case 3:
                System.out.println("Çarpım : " + (a*b));
                break;
            case 4:
                switch (b){
                    case 0:
                        System.out.println("Bir sayi 0'a bölünemez");
                        break;
                    default:
                        System.out.println("Bölüm : " + (a/b));
                }
                break;
            default:
                System.out.println("Geçersiz Seçim, Tekrar Deneyin");
        }



        /* //if-else
        int n1,n2,select;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayı : ");
        n1=input.nextInt();

        System.out.print("2. Sayı : ");
        n2=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        if(select == 1){
            System.out.println("Toplam : " + (n1+n2));
        } else if (select == 2) {
            System.out.println("Çıkarma : " + (n1-n2));
        } else if (select == 3) {
            System.out.println("Çarpma : " + (n1*n2));
        } else if (select == 4) {
            if(n2 != 0){
                System.out.println("Bölme : " + (n1/n2));
            }else{
                System.out.println("Bir sayi 0'a bölünemez");
            }
        } else {
            System.out.println("Geçersiz İşlem, Tekrar deneyiniz.");
        }

         */
    }
}
