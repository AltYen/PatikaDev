package BasicOfJava.Arrays.Examples;

public class AverageOfArray {
    public static void main(String[] args) {

        /*
        int[] list = {1,2,3,4,5};
        double sum = 0.0;
        for(int i = 0; i<list.length;i++){
            sum+=list[i];
        }

        //int / int integer değer döndürür.
        double average=sum/list.length;
        System.out.println(average);

         */

        double arr[] = { 13.5, 14.5, 14.8, 15.2, 16.1 };
        double sum = 0.0;

        for(int i = 0;i<arr.length;i++){
            sum+=1.0/arr[i];
        }

        System.out.println("Harmonic Average = " + (arr.length/sum));

    }
}
