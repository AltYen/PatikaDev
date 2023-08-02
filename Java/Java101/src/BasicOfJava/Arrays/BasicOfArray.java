package BasicOfJava.Arrays;

public class BasicOfArray {
    static void printArray(int[] arr){ // array parametre tanımlama.
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    // printArray methodu override edildi.
    static void printArray(double[] arr){ // array parametre tanımlama.
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static int[] reverse(int[] list){ // integer array geri döndüren method tanımlama.
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length-1; i<list.length; i++,j--){
            reverse[i]=list[j];
        }
        return reverse;
    }
    public static void main(String[] args) {
        int[] list = new int[10]; // 10 elemanlı integer dizi tanımlama. Array tanımlarken boyut vermek zorunlu.
        // int list2[] = new int[20]; // farklı bir tanımlama yöntemi.
        int[] list3 = {10,20,30,40,50,60,70,80,90,100}; // varsayılan değer ile tanımlama.
        double[] list4 = {1.1,2.2,3.3}; // varsayılan değer ile tanımlama.

        int[] newList = reverse(list3);
        printArray(newList);

        /*
        for(int j = 0; j<list3.length;j++){
            System.out.println(list3[j]);
        }
        printArray(list4);

        System.out.println(list.length); // dizideki eleman sayısını(boyutunu) bulma.
        for (int i = 0; i<list.length;i++){
            list[i] = (i*10) + 10;
            System.out.println(list[i]);
        }

         */

        /*
        list[0] = 10;
        list[1] = 20;
        list[2] = 30;
        list[1] = 20;

        System.out.println(list[0]);

         */

    }
}
