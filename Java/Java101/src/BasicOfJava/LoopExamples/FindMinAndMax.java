package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class FindMinAndMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number,count,min=0,max=0;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        count=inp.nextInt();
        for(int i = 1;i<=count;i++){
            System.out.print(i+". Sayıyı Giriniz: ");
            number=inp.nextInt();
            if(number<min)
                min=number;
            if(number>max)
                max=number;
        }
        System.out.println("En Büyük Sayı: "+max);
        System.out.println("En Küçük Sayı: "+min);
    }
}
