package BasicOfJava.Example;

import java.util.Scanner;

public class BasicPlaneTicketCalc {
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        double kmUcret = 0.10,totalUcret=0,indirim=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = inp.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = inp.nextInt();

        if(mesafe>0 && yas>0 && (yolculukTipi == 1 || yolculukTipi == 2)){
            totalUcret = mesafe * kmUcret;

            if(yas<12)
                indirim = totalUcret * 0.50;
            else if(yas>=12 && yas<=24)
                indirim = totalUcret * 0.10;
            else if (yas>=65)
                indirim = totalUcret * 0.30;

            totalUcret -= indirim;

            if (yolculukTipi == 2){
                indirim = totalUcret * 0.20;
                totalUcret = (totalUcret-indirim)*2;
            }

            System.out.println("Toplam Tutar = " + totalUcret + " TL");
        }else
            System.out.println("Hatalı Veri Girdiniz !");

    }
}
