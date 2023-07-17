package HackerRankExamples;

import java.util.Scanner;

public class LoopII {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int q,a,b,n;
        int x,y;
        q=inp.nextInt();
        for(int i = 1; i<=q;i++){
            a= inp.nextInt();
            b= inp.nextInt();
            n= inp.nextInt();

            for(int j = 1;j<=n;j++){
                a+=b;
                System.out.print(a + " ");
                b*=2;
            }
        }

    }
}
