package CoderbyteChallenges;

import java.util.Scanner;

public class FirstFactorial {
    public static int FirstFactorial(int num) {
        int sum = 1;
        for(int i = 1;i<=num;i++){
            sum*=i;
        }
        // code goes here
        return sum;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }
}
