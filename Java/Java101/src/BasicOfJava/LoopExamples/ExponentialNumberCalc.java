package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class ExponentialNumberCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x,y,i=1,calc=1;

        System.out.print("x : ");
        x = inp.nextInt();

        System.out.print("y : ");
        y = inp.nextInt();

        /*
        while(i<=y){
            calc*=x;
            i++;
        }
         */

        for(i=1;i<=y;i++){
            calc*=x;
        }

        System.out.println(x+"^"+y+" = " + calc);


    }
}
