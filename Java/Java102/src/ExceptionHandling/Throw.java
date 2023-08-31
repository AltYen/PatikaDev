package ExceptionHandling;

import java.util.Scanner;

public class Throw {
    public static void checkAge(int age) throws Exception {
        if(age<18){
            throw new Exception("Yaşınız Tutmuyor"); // altındaki kod blokları çalışmaz
        }
        System.out.println("Yaşı Uygundur !");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı Girin : ");
        int age = input.nextInt();
        try {
            checkAge(age);
        }catch (Exception e){
            System.out.println("Yaşı uymadı!");
            System.out.println(e.toString());
        }
        System.out.println("Program bitti");
    }
}
