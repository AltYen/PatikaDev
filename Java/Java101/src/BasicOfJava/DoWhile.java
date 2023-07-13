package BasicOfJava;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*
        // do while kod bloğu whiledan bağımsız 1 kez kesin olarak çalışır.
        int year = 2021;
        do{
            System.out.println(year);
            year++;
        }while (year<2021); // ne olursa olsun girer.

         */
        Scanner inp = new Scanner(System.in);
        int password;
        boolean askPassword = true;

        do{
            System.out.print("Password : ");
            password=inp.nextInt();
            if(password==123){
                System.out.println("Dogru");
                askPassword=false;
            }else
                System.out.println("Yanlis");
        }while (askPassword);
    }
}
