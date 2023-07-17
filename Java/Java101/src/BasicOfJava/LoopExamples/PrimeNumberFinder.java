package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        int bolumSayisi=0;
        for(int i=1;i<=100;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    bolumSayisi++;
            }
            if(bolumSayisi==2){
                System.out.print(i+ " ");
            }
            bolumSayisi=0;
        }
    }

}
