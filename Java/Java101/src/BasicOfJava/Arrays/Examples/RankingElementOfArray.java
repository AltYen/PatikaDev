package BasicOfJava.Arrays.Examples;

import java.util.Arrays;
import java.util.Scanner;

public class RankingElementOfArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int listLength,number;
        System.out.print("Dizinin boyutu n : ");
        listLength = inp.nextInt();

        int[] list = new int[listLength];

        for(int i = 0;i<listLength;i++){
            System.out.print(i+1+". Elemanı : ");
            number=inp.nextInt();
            list[i]=number;
        }

        Arrays.sort(list);
        System.out.print("Sıralama : ");
        for(int i:list){
            System.out.print(i+" ");
        }


    }
}
