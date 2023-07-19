package BasicOfJava.MethodExamples;

import java.util.Scanner;

public class PalindromNumber {

    static boolean isPalindrom(int number){
        int temp = number,reverseNumber=0,lastNumber;
        while (temp != 0){
            System.out.println("---------");
            System.out.println("Sayi => " + temp);
            lastNumber = temp % 10;
            System.out.println("Son Basamak => " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber; // 1. 0 * 10 + 7 = 7 | 2. 7*10 + 4 = 74 | 3. 74*10 + 2 = 742. bu akış ile hesaplar.
            System.out.println("Yeni sayı => " + reverseNumber);
            temp /=10;
            System.out.println("Yeni Temp => " + temp);

        }

        if(number==reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.print("Number : ");
        number=inp.nextInt();
        //247,2476
        if(isPalindrom(number))
            System.out.println(number + " bir palindrom sayidir");
        else
            System.out.println(number + " bir palindrom sayi değildir");
    }
}
