package BasicOfJava.Arrays;

public class HelperArray {

    // herhangi methodun başına static koyarsak, static tanımlaman bir methodu nesne üretmeden çağırabiliriz.
    static void print(int[] arr){
        System.out.print("[ ");
        for(int i:arr){
            System.out.print(i+ " ");
        }
        System.out.println("]");
    }

    void print(double[] arr){
        System.out.print("[ ");
        for(double  i:arr){
            System.out.print(i+ " ");
        }
        System.out.println("]");
    }

    static int[] fill(int[] arr,int value){
        for(int i = 0; i < arr.length;i++){
            arr[i]=value;
        }
        return arr;
    }

    static int search(int[] arr, int value){
        for (int i = 0; i<arr.length;i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    static boolean equals(int[] l1, int[] l2){
        if(l1.length != l2.length)
            return false;

        for (int i = 0; i<l1.length;i++){
            if(l1[i] != l2[i])
                return false;
        }
        return true;
    }
}
