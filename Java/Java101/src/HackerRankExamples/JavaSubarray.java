package HackerRankExamples;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr= new int[n];

        for(int i = 0; i<n;i++){
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        int negativeSubarray=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i; k<=j;k++){
                    sum+=arr[k];
                }

                if(sum< 0){
                    negativeSubarray++;
                }
            }
        }

        System.out.println(negativeSubarray);
    }
}
