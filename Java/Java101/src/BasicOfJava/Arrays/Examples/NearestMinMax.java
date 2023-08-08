package BasicOfJava.Arrays.Examples;

import java.util.Scanner;
import java.util.Arrays;

public class NearestMinMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);

        int nearestMin=0, nearestMax=0,value;

        System.out.print("Girilen Sayı : ");
        value = inp.nextInt();

        if((list[0]<value) && (value<=list[list.length-1])){
            for(int i=0;i<list.length;i++){
                if(value<=list[i]){
                    nearestMax=list[i];
                    nearestMin=list[i-1];
                    break;
                }
            }
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearestMin);
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + nearestMax);
        }else{
            System.out.println(list[0]+" - "+list[list.length-1]+ " Arasında bir değer giriniz.");
        }
    }
}
