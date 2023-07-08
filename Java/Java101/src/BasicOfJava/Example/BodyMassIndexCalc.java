package BasicOfJava.Example;

import java.util.Scanner;

public class BodyMassIndexCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kilo,boy,indeks;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy=inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo=inp.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

    }
}
