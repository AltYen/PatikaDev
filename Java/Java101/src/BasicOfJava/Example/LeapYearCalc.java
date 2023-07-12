package BasicOfJava.Example;

import java.util.Scanner;

public class LeapYearCalc {
    public static void main(String[] args) {
        int yil;
        boolean isLeapYear = false;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil = inp.nextInt();

        if(yil % 4 == 0){
            if(yil % 100 == 0 ){
                isLeapYear = (yil % 400 == 0) ? true : false;
            }else{
                isLeapYear=true;
            }
        }

        if(isLeapYear)
            System.out.println(yil + " bir artık yıldır !");
        else
            System.out.println(yil + " bir artık yil değildir !");
    }
}
