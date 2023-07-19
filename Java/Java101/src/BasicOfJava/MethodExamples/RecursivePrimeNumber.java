package BasicOfJava.MethodExamples;

import java.util.Scanner;

public class RecursivePrimeNumber {

    static boolean isPrimeNumber(int number,int mod){
        if(number<2)
            return false;
        if(mod == 1)
            return true;
        if(number%mod==0)
            return false;

        return isPrimeNumber(number,mod-1);
    }
    public static void main(String[] args) {

        int number;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        number=inp.nextInt();

        if(isPrimeNumber(number,number-1))
            System.out.println(number +" sayisi asaldir");
        else
            System.out.println(number +" sayisi asal değildir");

}
}
