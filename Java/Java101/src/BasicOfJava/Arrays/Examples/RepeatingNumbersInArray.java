package BasicOfJava.Arrays.Examples;

import java.util.Arrays;

public class RepeatingNumbersInArray {

    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3,7,3,3,2,9,10,21,1,33,9,1,2,10,10,8};
        int[] duplicateList = new int[list.length];
        int startIndex= 0;
        /* // dizedeki tekrar eden sayilar.
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length;j++){
                if(i!=j && list[i] == list[j]){
                    if(!isFind(duplicateList,list[i]))
                        duplicateList[startIndex++] = list[i];
                    break;
                }
            }
        }

        for (int value:duplicateList){
            if(value != 0)
                System.out.print(value + " ");
        }

         */

        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length;j++){
                if(i!=j && list[i] == list[j] && list[j] % 2 == 0)
                    if(!isFind(duplicateList,list[i]))
                        duplicateList[startIndex++] = list[i];
            }
        }

        System.out.print("Tekrar eden çift sayılar : ");

        for (int value:duplicateList){
            if(value != 0)
                System.out.print(value + " ");
        }
    }
}
