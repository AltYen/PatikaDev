package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Başladı!");
        Scanner input = new Scanner(System.in);
        int a = 1;
        int b = 20;
        int c;
        int[] arr = new int[2];
        try{
            // hata olması potansiyel yerler try bloğu içerisine yazılır.
            //blok içerisinde hata yakalanırsa catch bloğuna geçer.

            System.out.println("Bölme işlemi");
            System.out.println(b/a);
            System.out.println("Bölme İşlemi Bitti");
            //c=input.nextInt();
            //arr[10] = 11;
        }catch (ArithmeticException e){
            System.out.println("Aritmatik Hata Alındı");
            System.out.println(e.toString());
           // System.out.println(e.getMessage());
           // System.out.println("Hata Yakalandı!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Bu kısım kesinlikle çalışacak");
        }
        /*catch (InputMismatchException e){
            System.out.println("Yanlış veri girildi!");
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array hatası alındı");
            System.out.println(e.getMessage());

        }

         */

        System.out.println("Program Bitti !");
    }
}
