package Hackerrank;

public class Generics {
    static <T> void printArray(T[] arr){
        for(T i:arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        String[] b = {"Hello","World"};

        printArray(a);
        printArray(b);

    }
}
