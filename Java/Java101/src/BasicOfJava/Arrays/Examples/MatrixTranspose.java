package BasicOfJava.Arrays.Examples;

import java.util.Arrays;

public class MatrixTranspose {
    static void printArray(int[][] arr){
        for(int[] i:arr){
            for(int k:i){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {2,3,4},
                {5,6,4}
        };

        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j< matrix[i].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }

        System.out.println("Matris : ");
        printArray(matrix);
        System.out.println("Transpoze : ");
        printArray(transpose);
    }
}
