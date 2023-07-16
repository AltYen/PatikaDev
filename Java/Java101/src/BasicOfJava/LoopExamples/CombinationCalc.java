package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class CombinationCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,r,nFak,rFak,nrFak,sum=1;

        System.out.print("N : ");
        n = inp.nextInt();

        System.out.print("r : ");
        r = inp.nextInt();

        for (int i = 1; i<=n;i++){
            sum*=i;
        }

        nFak = sum;
        sum = 1;

        for (int j = 1; j<=r;j++){
            sum*=j;
        }

        rFak=sum;
        sum=1;

        for (int k = 1; k<=(n-r);k++){
            sum*=k;
        }

        nrFak=sum;

        int calc = nFak / (rFak*nrFak);
        System.out.println("C("+n+","+r+") = " + calc);




    }
}
