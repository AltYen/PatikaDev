package BasicOfJava;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*
        int i = 1;
        int k;
        System.out.println("Program Başladı");

        while (i <= 5){
            System.out.println(i);

            k=1;
            while(k<=10){
                System.out.print(k + ",");
                k++;
            }
            System.out.println();

            i++;
        }

        System.out.println("Program Bitti");

        int left = 100, right=200;
        while (++left < --right);
        System.out.println(left);

         */

        int password;
        Scanner inp = new Scanner(System.in);

        boolean checkPassword = false;

        while (!checkPassword) { // while döngüsü true olduğu sürece döner.
            System.out.print("Password : ");
            password = inp.nextInt();
            if (password == 123){
                System.out.println("Dogru");
                checkPassword=true;
            }
            else
                System.out.println("Yanlis");
        }



    }
}
