package BasicOfJava.Example;

import java.util.Scanner;

public class ActivitySuggest {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklık : ");
        heat=inp.nextInt();

        /*
        if(heat<5){
            System.out.println("Kayak Yapabilirsiniz");
        }else if(heat<=25){
            if(heat<=15){
                System.out.println("Sinemaya gidebilirsin");
            }
            if(heat>=10){
                System.out.println("Pikniğe gidebilirsin");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsin");
        }

         */

        if(heat<5){
            System.out.println("Kayak Yapabilirsiniz");
        }
        if(heat>=5 && heat <=15){
            System.out.println("Sinemaya gidebilirsin");
        }
        if(heat>=15 && heat <=25){
            System.out.println("Pikniğe gidebilirsin");
        }
        if(heat>25){
            System.out.println("Yüzmeye gidebilirsin");
        }
    }
}
