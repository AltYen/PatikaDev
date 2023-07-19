package BasicOfJava.MethodExamples;

import java.util.Scanner;

public class RecursiveNumberPattern {
    static void pattern(int number, int numberBackup, boolean flag){
        System.out.print(number+ " ");

        if(flag && number == numberBackup){
            return;
        }

        if (number<=0){
            flag=true;
            pattern(number+5,numberBackup,flag);
        }
        else if(!flag){
            pattern(number-5,numberBackup,flag);
        }
        else{
            pattern(number+5,numberBackup,flag);
        }

    }
    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        number=inp.nextInt();

        pattern(number,number,false);
    }
}

