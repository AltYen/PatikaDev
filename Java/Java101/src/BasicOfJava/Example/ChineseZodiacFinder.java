package BasicOfJava.Example;

import java.util.Scanner;

public class ChineseZodiacFinder {
    public static void main(String[] args) {
        int dogumYil;
        String zodiac="";
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        dogumYil = inp.nextInt();

        if(dogumYil % 12 == 0)
            zodiac="Maymun";
        else if (dogumYil % 12 == 1) {
            zodiac="Horoz";
        }
        else if (dogumYil % 12 == 2) {
            zodiac="Köpek";
        }
        else if (dogumYil % 12 == 3) {
            zodiac="Domuz";
        }
        else if (dogumYil % 12 == 4) {
            zodiac="Fare";
        }
        else if (dogumYil % 12 == 5) {
            zodiac="Öküz";
        }
        else if (dogumYil % 12 == 6) {
            zodiac="Kaplan";
        }
        else if (dogumYil % 12 == 7) {
            zodiac="Tavşan";
        }
        else if (dogumYil % 12 == 8) {
            zodiac="Ejderha";
        }
        else if (dogumYil % 12 == 9) {
            zodiac="Yılan";
        }
        else if (dogumYil % 12 == 10) {
            zodiac="At";
        }
        else if (dogumYil % 12 == 11) {
            zodiac="Koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz : " + zodiac);

    }
}
