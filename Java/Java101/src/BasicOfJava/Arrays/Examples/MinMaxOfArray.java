package BasicOfJava.Arrays.Examples;

public class MinMaxOfArray {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min=0,max=0;

        for(int i:list){
            if(i>max)
                max=i;
            if(i<min)
                min=i;
        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}
