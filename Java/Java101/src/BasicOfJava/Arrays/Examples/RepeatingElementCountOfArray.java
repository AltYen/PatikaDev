package BasicOfJava.Arrays.Examples;

import java.util.Arrays;

public class RepeatingElementCountOfArray {
    static boolean inArray(int[] arr,int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] repeatCount = new int[list.length];
        int[] controlList = new int[list.length];

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");

        for(int i = 0; i< list.length;i++){
            for(int j = 0; j<list.length;j++){
                if(list[i]==list[j]){
                    repeatCount[i]+=1;
                }
            }
            if(!(inArray(controlList,list[i]))){
                controlList[i]=list[i];
                System.out.println(list[i] + " sayısı " + repeatCount[i] + " kere tekrar edildi.");
            }
        }

    }
}
