package BasicOfJava.Example;

import java.util.Scanner;

public class GroceryStoreCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double armutKgFiyat=2.14,elmaKgFiyat=3.67,domatesKgFiyat=1.11,muzKgFiyat=0.95,patlicanKgFiyat=5,totalFiyat;
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg;

        System.out.print("Armut Kaç Kilo ?: ");
        armutKg=inp.nextDouble();


        System.out.print("Elma Kaç Kilo ?: ");
        elmaKg=inp.nextDouble();

        System.out.print("Domates Kaç Kilo ?: ");
        domatesKg=inp.nextDouble();

        System.out.print("Muz Kaç Kilo ?: ");
        muzKg=inp.nextDouble();

        System.out.print("Patlican Kaç Kilo ?: ");
        patlicanKg=inp.nextDouble();

        totalFiyat=(armutKg*armutKgFiyat)+(elmaKg*elmaKgFiyat)+(domatesKg*domatesKgFiyat)+(muzKg*muzKgFiyat)+(patlicanKg*patlicanKgFiyat);

        System.out.println("Toplam Tutar : " + totalFiyat + " TL");

    }
}
